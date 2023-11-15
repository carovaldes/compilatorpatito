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

    operacion = quad.operador
    
    if operacion == 1: #+
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) + (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == 2: #-
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) - (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == 3: #*
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) * (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == 4: #/
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq) / (der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == 6: #>
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq > der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == 5: #<
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq < der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == 8: #!=
        izq = checkMem(quad.operando1)
        der = checkMem(quad.operando2)
        res = (izq != der)
        memoria[quad.target] = res
        currPointer+=1

    elif operacion == 7: #=
        op = checkMem(quad.operando1)
        memoria[quad.target] = op
        currPointer+=1

    elif operacion == 10: #Goto
        currPointer = quad.target

    elif operacion == 11: #GotoF
        op = memoria[quad.operando1]
        if (op == False):
            currPointer = quad.target
        else:
            currPointer+=1

    elif operacion == 12: #'GotoV'
        op = memoria[quad.operando1]
        if (op == True):
            currPointer = quad.target
        else:
            currPointer+=1

    elif operacion == 13: #'print'
        print(memoria[quad.target])
        currPointer+=1
    

def runVm():
    global currPointer
    while (currPointer < len(cuadruplos)):
        switchVM(cuadruplos[currPointer])
        