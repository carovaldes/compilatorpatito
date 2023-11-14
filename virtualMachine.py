from symbolTable import *

currPointer = 0

def checkMem(op):
    if op < 0:
        return (memoria[op * -1] * -1)
    else:
        return memoria[op]

#switch
def switchVM(quad):
    global cuadruplos, currPointer
    #cambiar + - etc por dir memoria
    operacion = quad.operador
    
    if operacion == '+':
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) + (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == '-':
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) - (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == '*':
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) * (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == '/':
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) / (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == '>':
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) > (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == '<':
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) < (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == '!=':
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) != (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == '=':
        op = checkMem(quad.operando1)
        memoria[quad.target] = op
        currPointer+=1

    elif operacion == 'Goto':
        currPointer = quad.target

    elif operacion == 'GotoF':
        op = memoria[quad.operando1]
        print("estoy en GotoF ", op)
        if (op == False):
            currPointer = quad.target
        else:
            currPointer+=1

    elif operacion == 'GotoV':
        op = memoria[quad.operando1]
        if (op == True):
            currPointer = quad.target
        else:
            currPointer+=1

    elif operacion == 'print':
        print(memoria[quad.target])
        currPointer+=1
    

def runVm():
    global currPointer
    print("corre VM")
    while (currPointer < len(cuadruplos)):
        #print('pointer: ', currPointer)
        switchVM(cuadruplos[currPointer])
        