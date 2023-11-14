from dataclasses import dataclass
from semanticCube import semanticCube

#arreglo para directorio de funciones
dirFunc = []

#diccionario para almacenar memoria
memoria = {}

#direcciones de memoria para variables
#var global
vgi, vgf = 1000, 2000
#var local
vli, vlf = 5000, 6000
#var temporal - int, float, bool
ti, tf, tb = 9000, 10000, 12000
#constantes
ci, cf, cs = 13000, 14000, 15000

#arreglo para ctes
tablaCtes = {}

#diccionario operadores
tablaOper = {
    '+': 1,
    '-': 2,
    '*': 3,
    '/': 4,
    '<': 5,
    '>': 6,
    '=': 7,
    '!=': 8,
    '(': 9,
}

@dataclass
class Funcion:
    name: str 
    scope: str
    varTable: dict  
    #quadStart indice
    #quadEnd indice

@dataclass
class Variable:
    type: str
    dirMemoria: int

# agregar funcion 
def addFunction(name, scope):
    global dirFunc
    lookupFunc(name)
    dirFunc.append(Funcion(name, scope, {}))

#agregar vartable a funcion
def addVar(vars, type):
    global dirFunc, vgi, vgf, vli, vlf, memoria
    tempFunc = dirFunc[len(dirFunc)-1]
    tempTable = tempFunc.varTable

    varList = vars.split(',')

    for name in varList:
        lookupVar(name) #si no esta, la agrega
        #asignar memoria
        if (tempFunc.scope == 'global'):
            if (type == 'int'): 
                tempTable[name] = Variable(type, vgi)
                memoria[vgi] = name
                vgi+=1 
            else:
                tempTable[name] = Variable(type, vgf)
                memoria[vgf] = name
                vgf+=1
        else:
            if (type == 'int'): 
                tempTable[name] = Variable(type, vli)
                memoria[vli] = name
                vli+=1
            else:
                tempTable[name] = Variable(type, vlf)
                memoria[vlf] = name
                vlf+=1    
    dirFunc[len(dirFunc)-1].varTable = tempTable

# buscar si existe en func
def lookupFunc(name):
    global dirFunc
    for funct in dirFunc:
        if funct.name == name:
            raise ValueError(f"Duplicate declaration of funcion: {name}")
    return None

#buscar si existe variable
def lookupVar(name):
    global dirFunc 
    try:
        if dirFunc[len(dirFunc)-1].varTable[name]:
            raise ValueError(f"Duplicate declaration of variable: {name}")
    except KeyError:
        pass

#borrar registro
def deleteVarTable(name):
    global dirFunc
    for func in dirFunc:
        if func.name == name:
            print(name, ': ', func.varTable)
            func.varTable = {}
            return

def deleteAll():
    global dirFunc
    del dirFunc

def imprime():
    print('entre al imprime')
    global dirFunc
    for func in dirFunc:
        print(func)

    print(POperador)
    print(POperando)
    print(tablaCtes)
    print(memoria)
    global cuadruplos
    for quad in cuadruplos:
        print(quad)

#cuadruplos
@dataclass
class Cuadruplo:
    operador: any 
    operando1: any
    operando2: any
    target: any

#PJump
PJump = []
#Poper
POperador = []
#Poperando
POperando = []
#tipos del operando
Tipos = []

# arreglo = cuadrupo  
cuadruplos = []

#contador de cuadruplo
cont = 0

#cuadruplo 'main' 
def pushMain():
    global PJump, cuadruplos, cont
    quad = Cuadruplo('Goto', None, None, None)
    PJump.append(cont)
    cuadruplos.append(quad)
    cont+=1

def quadruploMain():
    global PJump, cuadruplos, cont
    jump = PJump.pop()
    quad = cuadruplos[jump]
    quad.target = cont
    cuadruplos[jump] = quad


#funcion donde se hace el push
#para operador
def pushOperator(oper):
    global POperador
    POperador.append(oper)

#para operando
def pushOperand(oper, symbol, type, isConst, isTemp):
    global POperando, tablaCtes, ci, cf, cs, memoria
    #si es constante
    if (isConst):
        if oper in tablaCtes:
            POperando.append(tablaCtes[oper] * -1) if symbol == '-' else POperando.append(tablaCtes[oper])
        else:
            if (type == 'int'):
                tablaCtes[oper] = ci
                POperando.append(ci * -1) if symbol == '-' else POperando.append(ci)
                memoria[ci] = int(oper)
                ci+=1
            elif (type == 'float'):
                tablaCtes[oper] = cf
                POperando.append(cf * -1) if symbol == '-' else POperando.append(cf)
                memoria[cf] = float(oper)
                cf+=1
            else:
                tablaCtes[oper] = cs
                POperando.append(cs)
                memoria[cs] = oper
                cs+=1
    #es temporal (oper = ya un espacio en memoria)
    #en calculo de cuadruplos saco su tipo
    elif (isTemp):
        POperando.append(oper)
    #es variable
    else:
        var = varExists(oper)
        mem, type = var
        POperando.append(mem * -1) if symbol == '-' else POperando.append(mem)
    #push tipo    
    Tipos.append(type)

def varExists(oper):
    global dirFunc
    memoria = 0
    tipo = ''
    var = dirFunc[len(dirFunc)-1].varTable.get(oper, '!Unknown')
    
    if (var == '!Unknown'):
        #global
        var = dirFunc[0].varTable.get(oper, '!Unknown')
        if (var == '!Unknown'):
            raise ValueError(f"Variable not declared: {oper}")
    
    memoria = var.dirMemoria
    tipo = var.type
    return memoria, tipo

#funcion donde se hace el pop
def popOperand():
    global POperando
    return POperando.pop()

def popOperator():
    global POperador
    return POperador.pop()

#cuadruplos - operaciones
#para + - y * /
def cuadruploTermino(op1, op2):
    global cuadruplos, POperador, POperando, Tipos, ti, tf, cont, memoria
    if (len(POperador) > 0 and (POperador[-1] == op1 or POperador[-1] == op2)):
        rightOperand = POperando.pop(); rightType = Tipos.pop()
        leftOperand = POperando.pop(); leftType = Tipos.pop()
        operador = POperador.pop()
        print(leftType, rightType, operador)
        print('operadores: ', leftOperand, rightOperand)
        resultType = semanticCube[leftType][rightType][operador]
        #dependiendo de result type asignar ti, tf
        if (resultType == 'int'):
            #temporal
            quad = Cuadruplo(operador, leftOperand, rightOperand, ti)
            result = ti
            memoria[ti] = 0
            ti+=1
        else: #era float
            quad = Cuadruplo(operador, leftOperand, rightOperand, tf)
            result = tf
            memoria[tf] = 0
            tf+=1
        cuadruplos.append(quad); cont+=1
        POperando.append(result) # ???
        Tipos.append(resultType)

# < > != 
def cuadruploExpresion():
    global cuadruplos, POperador, POperando, Tipos, tb, cont, memoria
    if (len(POperador) > 0 and (POperador[-1] == '>' or POperador[-1] == '<' or POperador[-1] == '!=')):
        rightOperand = POperando.pop(); rightType = Tipos.pop()
        leftOperand = POperando.pop(); leftType = Tipos.pop()
        operador = POperador.pop()
        resultType = semanticCube[leftType][rightType][operador]
        #asignar temporal bool; resultType siempre es bool
        quad = Cuadruplo(operador, leftOperand, rightOperand, tb)
        result = tb
        memoria[tb] = 0
        tb+=1
        cuadruplos.append(quad); cont+=1
        POperando.append(result)
        Tipos.append(resultType)

def cuadruploAssign():
    global cuadruplos, POperador, POperando, Tipos, tb, cont
    if (len(POperador) > 0 and (POperador[-1] == '=')):
        operador = POperador.pop()
        operando = POperando.pop(); operandoType = Tipos.pop()
        target = POperando.pop(); targetType = Tipos.pop()  #deberia de ser una variable    
        resultType = semanticCube[targetType][operandoType][operador]
        if (resultType != 'Error'):
            quad = Cuadruplo(operador, operando, None, target)
            cuadruplos.append(quad); cont+=1
        else:
            raise ValueError(f"Type-mismatch during: {targetType}")

#IF - ELSE
def ifElse1():
    global Tipos, POperador, POperando, cont, cuadruplos, PJump
    tipo = Tipos.pop()
    if (tipo != 'bool'):
        raise ValueError(f"Variable not boolean (type-mismatch): {tipo}")
    else:
        result = POperando.pop()
        quad = Cuadruplo('GotoF', result, None, None)
        cuadruplos.append(quad)
        cont+=1
        PJump.append(cont-1)

def ifElse2():
    global cont, cuadruplos, PJump
    end = PJump.pop()
    fill = cuadruplos[end]
    fill.target = cont
    cuadruplos[end] = fill

def ifElse3():
    global Tipos, POperador, POperando, cont, cuadruplos, PJump
    quad = Cuadruplo('Goto',None,None,None)
    cuadruplos.append(quad)
    cont+=1
    false = PJump.pop()
    PJump.append(cont-1)
    fill = cuadruplos[false]
    fill.target = cont
    cuadruplos[false] = fill

#WHILE - DO
def pushCont():
    global cont, PJump
    PJump.append(cont)

def returnWhile():
    global cont, PJump, cuadruplos, POperando, Tipos
    tipo = Tipos.pop()
    if (tipo != 'bool'):
        raise ValueError(f"Variable not boolean (type-mismatch): {tipo}")
    else:
        ret = PJump.pop()
        result = POperando.pop() 
        quad = Cuadruplo('GotoV', result, None, ret)
        cont+=1
        cuadruplos.append(quad)

#PRINT
def cuadruploPrint():
    global POperando, cuadruplos, cont, Tipos
    toPrint = POperando.pop()
    Tipos.pop()
    quad = Cuadruplo('print', None, None, toPrint)
    cuadruplos.append(quad)
    cont+=1


#en cuadruplos guardar operandos/argumentos como string