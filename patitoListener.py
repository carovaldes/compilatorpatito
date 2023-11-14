# Generated from patito.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .patitoParser import patitoParser
else:
    from patitoParser import patitoParser

# This class defines a complete listener for a parse tree produced by patitoParser.
class patitoListener(ParseTreeListener):

    # Enter a parse tree produced by patitoParser#start.
    def enterStart(self, ctx:patitoParser.StartContext):
        pass

    # Exit a parse tree produced by patitoParser#start.
    def exitStart(self, ctx:patitoParser.StartContext):
        pass


    # Enter a parse tree produced by patitoParser#programa.
    def enterPrograma(self, ctx:patitoParser.ProgramaContext):
        pass

    # Exit a parse tree produced by patitoParser#programa.
    def exitPrograma(self, ctx:patitoParser.ProgramaContext):
        pass


    # Enter a parse tree produced by patitoParser#vars.
    def enterVars(self, ctx:patitoParser.VarsContext):
        pass

    # Exit a parse tree produced by patitoParser#vars.
    def exitVars(self, ctx:patitoParser.VarsContext):
        pass


    # Enter a parse tree produced by patitoParser#list_var.
    def enterList_var(self, ctx:patitoParser.List_varContext):
        pass

    # Exit a parse tree produced by patitoParser#list_var.
    def exitList_var(self, ctx:patitoParser.List_varContext):
        pass


    # Enter a parse tree produced by patitoParser#list_id.
    def enterList_id(self, ctx:patitoParser.List_idContext):
        pass

    # Exit a parse tree produced by patitoParser#list_id.
    def exitList_id(self, ctx:patitoParser.List_idContext):
        pass


    # Enter a parse tree produced by patitoParser#type.
    def enterType(self, ctx:patitoParser.TypeContext):
        pass

    # Exit a parse tree produced by patitoParser#type.
    def exitType(self, ctx:patitoParser.TypeContext):
        pass


    # Enter a parse tree produced by patitoParser#body.
    def enterBody(self, ctx:patitoParser.BodyContext):
        pass

    # Exit a parse tree produced by patitoParser#body.
    def exitBody(self, ctx:patitoParser.BodyContext):
        pass


    # Enter a parse tree produced by patitoParser#statement_loop.
    def enterStatement_loop(self, ctx:patitoParser.Statement_loopContext):
        pass

    # Exit a parse tree produced by patitoParser#statement_loop.
    def exitStatement_loop(self, ctx:patitoParser.Statement_loopContext):
        pass


    # Enter a parse tree produced by patitoParser#statement.
    def enterStatement(self, ctx:patitoParser.StatementContext):
        pass

    # Exit a parse tree produced by patitoParser#statement.
    def exitStatement(self, ctx:patitoParser.StatementContext):
        pass


    # Enter a parse tree produced by patitoParser#assign.
    def enterAssign(self, ctx:patitoParser.AssignContext):
        pass

    # Exit a parse tree produced by patitoParser#assign.
    def exitAssign(self, ctx:patitoParser.AssignContext):
        pass


    # Enter a parse tree produced by patitoParser#condition.
    def enterCondition(self, ctx:patitoParser.ConditionContext):
        pass

    # Exit a parse tree produced by patitoParser#condition.
    def exitCondition(self, ctx:patitoParser.ConditionContext):
        pass


    # Enter a parse tree produced by patitoParser#else.
    def enterElse(self, ctx:patitoParser.ElseContext):
        pass

    # Exit a parse tree produced by patitoParser#else.
    def exitElse(self, ctx:patitoParser.ElseContext):
        pass


    # Enter a parse tree produced by patitoParser#cycle.
    def enterCycle(self, ctx:patitoParser.CycleContext):
        pass

    # Exit a parse tree produced by patitoParser#cycle.
    def exitCycle(self, ctx:patitoParser.CycleContext):
        pass


    # Enter a parse tree produced by patitoParser#f_call.
    def enterF_call(self, ctx:patitoParser.F_callContext):
        pass

    # Exit a parse tree produced by patitoParser#f_call.
    def exitF_call(self, ctx:patitoParser.F_callContext):
        pass


    # Enter a parse tree produced by patitoParser#exp_loop.
    def enterExp_loop(self, ctx:patitoParser.Exp_loopContext):
        pass

    # Exit a parse tree produced by patitoParser#exp_loop.
    def exitExp_loop(self, ctx:patitoParser.Exp_loopContext):
        pass


    # Enter a parse tree produced by patitoParser#exp_loop_helper.
    def enterExp_loop_helper(self, ctx:patitoParser.Exp_loop_helperContext):
        pass

    # Exit a parse tree produced by patitoParser#exp_loop_helper.
    def exitExp_loop_helper(self, ctx:patitoParser.Exp_loop_helperContext):
        pass


    # Enter a parse tree produced by patitoParser#print.
    def enterPrint(self, ctx:patitoParser.PrintContext):
        pass

    # Exit a parse tree produced by patitoParser#print.
    def exitPrint(self, ctx:patitoParser.PrintContext):
        pass


    # Enter a parse tree produced by patitoParser#print_loop.
    def enterPrint_loop(self, ctx:patitoParser.Print_loopContext):
        pass

    # Exit a parse tree produced by patitoParser#print_loop.
    def exitPrint_loop(self, ctx:patitoParser.Print_loopContext):
        pass


    # Enter a parse tree produced by patitoParser#print_args.
    def enterPrint_args(self, ctx:patitoParser.Print_argsContext):
        pass

    # Exit a parse tree produced by patitoParser#print_args.
    def exitPrint_args(self, ctx:patitoParser.Print_argsContext):
        pass


    # Enter a parse tree produced by patitoParser#expresion.
    def enterExpresion(self, ctx:patitoParser.ExpresionContext):
        pass

    # Exit a parse tree produced by patitoParser#expresion.
    def exitExpresion(self, ctx:patitoParser.ExpresionContext):
        pass


    # Enter a parse tree produced by patitoParser#expresion_helper.
    def enterExpresion_helper(self, ctx:patitoParser.Expresion_helperContext):
        pass

    # Exit a parse tree produced by patitoParser#expresion_helper.
    def exitExpresion_helper(self, ctx:patitoParser.Expresion_helperContext):
        pass


    # Enter a parse tree produced by patitoParser#expresion_operator.
    def enterExpresion_operator(self, ctx:patitoParser.Expresion_operatorContext):
        pass

    # Exit a parse tree produced by patitoParser#expresion_operator.
    def exitExpresion_operator(self, ctx:patitoParser.Expresion_operatorContext):
        pass


    # Enter a parse tree produced by patitoParser#exp.
    def enterExp(self, ctx:patitoParser.ExpContext):
        pass

    # Exit a parse tree produced by patitoParser#exp.
    def exitExp(self, ctx:patitoParser.ExpContext):
        pass


    # Enter a parse tree produced by patitoParser#exp_helper.
    def enterExp_helper(self, ctx:patitoParser.Exp_helperContext):
        pass

    # Exit a parse tree produced by patitoParser#exp_helper.
    def exitExp_helper(self, ctx:patitoParser.Exp_helperContext):
        pass


    # Enter a parse tree produced by patitoParser#exp_operator.
    def enterExp_operator(self, ctx:patitoParser.Exp_operatorContext):
        pass

    # Exit a parse tree produced by patitoParser#exp_operator.
    def exitExp_operator(self, ctx:patitoParser.Exp_operatorContext):
        pass


    # Enter a parse tree produced by patitoParser#termino.
    def enterTermino(self, ctx:patitoParser.TerminoContext):
        pass

    # Exit a parse tree produced by patitoParser#termino.
    def exitTermino(self, ctx:patitoParser.TerminoContext):
        pass


    # Enter a parse tree produced by patitoParser#termino_helper.
    def enterTermino_helper(self, ctx:patitoParser.Termino_helperContext):
        pass

    # Exit a parse tree produced by patitoParser#termino_helper.
    def exitTermino_helper(self, ctx:patitoParser.Termino_helperContext):
        pass


    # Enter a parse tree produced by patitoParser#termino_operator.
    def enterTermino_operator(self, ctx:patitoParser.Termino_operatorContext):
        pass

    # Exit a parse tree produced by patitoParser#termino_operator.
    def exitTermino_operator(self, ctx:patitoParser.Termino_operatorContext):
        pass


    # Enter a parse tree produced by patitoParser#factor.
    def enterFactor(self, ctx:patitoParser.FactorContext):
        pass

    # Exit a parse tree produced by patitoParser#factor.
    def exitFactor(self, ctx:patitoParser.FactorContext):
        pass


    # Enter a parse tree produced by patitoParser#factor_operator.
    def enterFactor_operator(self, ctx:patitoParser.Factor_operatorContext):
        pass

    # Exit a parse tree produced by patitoParser#factor_operator.
    def exitFactor_operator(self, ctx:patitoParser.Factor_operatorContext):
        pass


    # Enter a parse tree produced by patitoParser#factor_arg.
    def enterFactor_arg(self, ctx:patitoParser.Factor_argContext):
        pass

    # Exit a parse tree produced by patitoParser#factor_arg.
    def exitFactor_arg(self, ctx:patitoParser.Factor_argContext):
        pass


    # Enter a parse tree produced by patitoParser#cte.
    def enterCte(self, ctx:patitoParser.CteContext):
        pass

    # Exit a parse tree produced by patitoParser#cte.
    def exitCte(self, ctx:patitoParser.CteContext):
        pass


    # Enter a parse tree produced by patitoParser#func.
    def enterFunc(self, ctx:patitoParser.FuncContext):
        pass

    # Exit a parse tree produced by patitoParser#func.
    def exitFunc(self, ctx:patitoParser.FuncContext):
        pass


    # Enter a parse tree produced by patitoParser#id_loop.
    def enterId_loop(self, ctx:patitoParser.Id_loopContext):
        pass

    # Exit a parse tree produced by patitoParser#id_loop.
    def exitId_loop(self, ctx:patitoParser.Id_loopContext):
        pass


    # Enter a parse tree produced by patitoParser#id_loop_prime.
    def enterId_loop_prime(self, ctx:patitoParser.Id_loop_primeContext):
        pass

    # Exit a parse tree produced by patitoParser#id_loop_prime.
    def exitId_loop_prime(self, ctx:patitoParser.Id_loop_primeContext):
        pass



del patitoParser