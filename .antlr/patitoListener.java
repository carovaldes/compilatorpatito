// Generated from d:/Tec/ITC/semestre 8/compiladores/compilatorpatito/patito.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link patitoParser}.
 */
public interface patitoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link patitoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(patitoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(patitoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(patitoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(patitoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(patitoParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(patitoParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#list_var}.
	 * @param ctx the parse tree
	 */
	void enterList_var(patitoParser.List_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#list_var}.
	 * @param ctx the parse tree
	 */
	void exitList_var(patitoParser.List_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#list_id}.
	 * @param ctx the parse tree
	 */
	void enterList_id(patitoParser.List_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#list_id}.
	 * @param ctx the parse tree
	 */
	void exitList_id(patitoParser.List_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(patitoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(patitoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(patitoParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(patitoParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#statement_loop}.
	 * @param ctx the parse tree
	 */
	void enterStatement_loop(patitoParser.Statement_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#statement_loop}.
	 * @param ctx the parse tree
	 */
	void exitStatement_loop(patitoParser.Statement_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(patitoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(patitoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(patitoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(patitoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(patitoParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(patitoParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(patitoParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(patitoParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(patitoParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(patitoParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#f_call}.
	 * @param ctx the parse tree
	 */
	void enterF_call(patitoParser.F_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#f_call}.
	 * @param ctx the parse tree
	 */
	void exitF_call(patitoParser.F_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#exp_loop}.
	 * @param ctx the parse tree
	 */
	void enterExp_loop(patitoParser.Exp_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#exp_loop}.
	 * @param ctx the parse tree
	 */
	void exitExp_loop(patitoParser.Exp_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#exp_loop_helper}.
	 * @param ctx the parse tree
	 */
	void enterExp_loop_helper(patitoParser.Exp_loop_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#exp_loop_helper}.
	 * @param ctx the parse tree
	 */
	void exitExp_loop_helper(patitoParser.Exp_loop_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(patitoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(patitoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#print_loop}.
	 * @param ctx the parse tree
	 */
	void enterPrint_loop(patitoParser.Print_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#print_loop}.
	 * @param ctx the parse tree
	 */
	void exitPrint_loop(patitoParser.Print_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#print_args}.
	 * @param ctx the parse tree
	 */
	void enterPrint_args(patitoParser.Print_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#print_args}.
	 * @param ctx the parse tree
	 */
	void exitPrint_args(patitoParser.Print_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(patitoParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(patitoParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#expresion_helper}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_helper(patitoParser.Expresion_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#expresion_helper}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_helper(patitoParser.Expresion_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#expresion_operator}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_operator(patitoParser.Expresion_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#expresion_operator}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_operator(patitoParser.Expresion_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(patitoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(patitoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#exp_helper}.
	 * @param ctx the parse tree
	 */
	void enterExp_helper(patitoParser.Exp_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#exp_helper}.
	 * @param ctx the parse tree
	 */
	void exitExp_helper(patitoParser.Exp_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#exp_operator}.
	 * @param ctx the parse tree
	 */
	void enterExp_operator(patitoParser.Exp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#exp_operator}.
	 * @param ctx the parse tree
	 */
	void exitExp_operator(patitoParser.Exp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(patitoParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(patitoParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#termino_helper}.
	 * @param ctx the parse tree
	 */
	void enterTermino_helper(patitoParser.Termino_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#termino_helper}.
	 * @param ctx the parse tree
	 */
	void exitTermino_helper(patitoParser.Termino_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#termino_operator}.
	 * @param ctx the parse tree
	 */
	void enterTermino_operator(patitoParser.Termino_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#termino_operator}.
	 * @param ctx the parse tree
	 */
	void exitTermino_operator(patitoParser.Termino_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(patitoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(patitoParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#factor_operator}.
	 * @param ctx the parse tree
	 */
	void enterFactor_operator(patitoParser.Factor_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#factor_operator}.
	 * @param ctx the parse tree
	 */
	void exitFactor_operator(patitoParser.Factor_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#factor_arg}.
	 * @param ctx the parse tree
	 */
	void enterFactor_arg(patitoParser.Factor_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#factor_arg}.
	 * @param ctx the parse tree
	 */
	void exitFactor_arg(patitoParser.Factor_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(patitoParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(patitoParser.CteContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(patitoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(patitoParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#id_loop}.
	 * @param ctx the parse tree
	 */
	void enterId_loop(patitoParser.Id_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#id_loop}.
	 * @param ctx the parse tree
	 */
	void exitId_loop(patitoParser.Id_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link patitoParser#id_loop_prime}.
	 * @param ctx the parse tree
	 */
	void enterId_loop_prime(patitoParser.Id_loop_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link patitoParser#id_loop_prime}.
	 * @param ctx the parse tree
	 */
	void exitId_loop_prime(patitoParser.Id_loop_primeContext ctx);
}