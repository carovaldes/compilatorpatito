// Generated from d:/Tec/ITC/semestre 8/compiladores/compilatorpatito/patito.g4 by ANTLR 4.13.1

from symbolTable import *
from virtualMachine import *

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class patitoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, Cte_int=30, Cte_float=31, 
		Cte_string=32, Id=33, WS=34;
	public static final int
		RULE_start = 0, RULE_programa = 1, RULE_vars = 2, RULE_list_var = 3, RULE_list_id = 4, 
		RULE_type = 5, RULE_body = 6, RULE_statement_loop = 7, RULE_statement = 8, 
		RULE_assign = 9, RULE_condition = 10, RULE_else = 11, RULE_cycle = 12, 
		RULE_f_call = 13, RULE_exp_loop = 14, RULE_exp_loop_helper = 15, RULE_print = 16, 
		RULE_print_loop = 17, RULE_print_args = 18, RULE_expresion = 19, RULE_expresion_helper = 20, 
		RULE_expresion_operator = 21, RULE_exp = 22, RULE_exp_helper = 23, RULE_exp_operator = 24, 
		RULE_termino = 25, RULE_termino_helper = 26, RULE_termino_operator = 27, 
		RULE_factor = 28, RULE_factor_operator = 29, RULE_factor_arg = 30, RULE_cte = 31, 
		RULE_func = 32, RULE_id_loop = 33, RULE_id_loop_prime = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "programa", "vars", "list_var", "list_id", "type", "body", "statement_loop", 
			"statement", "assign", "condition", "else", "cycle", "f_call", "exp_loop", 
			"exp_loop_helper", "print", "print_loop", "print_args", "expresion", 
			"expresion_helper", "expresion_operator", "exp", "exp_helper", "exp_operator", 
			"termino", "termino_helper", "termino_operator", "factor", "factor_operator", 
			"factor_arg", "cte", "func", "id_loop", "id_loop_prime"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'main'", "'end'", "'var'", "':'", "','", "'int'", 
			"'float'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'while'", 
			"'do'", "'print'", "'>'", "'<'", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'void'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Cte_int", "Cte_float", "Cte_string", 
			"Id", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "patito.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public patitoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(patitoParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			programa();
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Token Id;
		public TerminalNode Id() { return getToken(patitoParser.Id, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			pushMain()
			setState(74);
			match(T__0);
			setState(75);
			((ProgramaContext)_localctx).Id = match(Id);
			addFunction((((ProgramaContext)_localctx).Id!=null?((ProgramaContext)_localctx).Id.getText():null), 'global')
			setState(77);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(78);
				vars();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(81);
				func();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__2);
			quadruploMain()
			setState(89);
			body();
			imprime()
			setState(91);
			match(T__3);
			runVm()
			deleteAll()
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public List<List_varContext> list_var() {
			return getRuleContexts(List_varContext.class);
		}
		public List_varContext list_var(int i) {
			return getRuleContext(List_varContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__4);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				list_var();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Id );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_varContext extends ParserRuleContext {
		public List_idContext list_id;
		public TypeContext type;
		public List_idContext list_id() {
			return getRuleContext(List_idContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterList_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitList_var(this);
		}
	}

	public final List_varContext list_var() throws RecognitionException {
		List_varContext _localctx = new List_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((List_varContext)_localctx).list_id = list_id();
			setState(102);
			match(T__5);
			setState(103);
			((List_varContext)_localctx).type = type();
			setState(104);
			match(T__1);
			addVar((((List_varContext)_localctx).list_id!=null?_input.getText(((List_varContext)_localctx).list_id.start,((List_varContext)_localctx).list_id.stop):null), (((List_varContext)_localctx).type!=null?_input.getText(((List_varContext)_localctx).type.start,((List_varContext)_localctx).type.stop):null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_idContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(patitoParser.Id, 0); }
		public List_idContext list_id() {
			return getRuleContext(List_idContext.class,0);
		}
		public List_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterList_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitList_id(this);
		}
	}

	public final List_idContext list_id() throws RecognitionException {
		List_idContext _localctx = new List_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Id);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(108);
				match(T__6);
				setState(109);
				list_id();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public Statement_loopContext statement_loop() {
			return getRuleContext(Statement_loopContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__9);
			setState(115);
			statement_loop();
			setState(116);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_loopContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_loopContext statement_loop() {
			return getRuleContext(Statement_loopContext.class,0);
		}
		public Statement_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterStatement_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitStatement_loop(this);
		}
	}

	public final Statement_loopContext statement_loop() throws RecognitionException {
		Statement_loopContext _localctx = new Statement_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement_loop);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__16:
			case T__18:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				statement();
				setState(119);
				statement_loop();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token Id;
		public TerminalNode Id() { return getToken(patitoParser.Id, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((AssignContext)_localctx).Id = match(Id);
			pushOperand((((AssignContext)_localctx).Id!=null?((AssignContext)_localctx).Id.getText():null), '', '', 0, 0)
			setState(133);
			match(T__11);
			pushOperator('=')
			setState(135);
			expresion();
			cuadruploAssign()
			setState(137);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__12);
			setState(140);
			match(T__13);
			setState(141);
			expresion();
			setState(142);
			match(T__14);
			ifElse1()
			setState(144);
			body();
			setState(145);
			else_();
			setState(146);
			match(T__1);
			ifElse2()
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__15);
				ifElse3()
				setState(151);
				body();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitCycle(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__16);
			pushCont()
			setState(157);
			body();
			setState(158);
			match(T__17);
			setState(159);
			match(T__13);
			setState(160);
			expresion();
			returnWhile()
			setState(162);
			match(T__14);
			setState(163);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class F_callContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(patitoParser.Id, 0); }
		public Exp_loopContext exp_loop() {
			return getRuleContext(Exp_loopContext.class,0);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterF_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitF_call(this);
		}
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_f_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(Id);
			setState(166);
			match(T__13);
			setState(167);
			exp_loop();
			setState(168);
			match(T__14);
			setState(169);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_loopContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Exp_loop_helperContext exp_loop_helper() {
			return getRuleContext(Exp_loop_helperContext.class,0);
		}
		public Exp_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExp_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExp_loop(this);
		}
	}

	public final Exp_loopContext exp_loop() throws RecognitionException {
		Exp_loopContext _localctx = new Exp_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_loop);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__22:
			case T__23:
			case Cte_int:
			case Cte_float:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				expresion();
				setState(172);
				exp_loop_helper();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_loop_helperContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Exp_loop_helperContext exp_loop_helper() {
			return getRuleContext(Exp_loop_helperContext.class,0);
		}
		public Exp_loop_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_loop_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExp_loop_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExp_loop_helper(this);
		}
	}

	public final Exp_loop_helperContext exp_loop_helper() throws RecognitionException {
		Exp_loop_helperContext _localctx = new Exp_loop_helperContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_loop_helper);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__6);
				setState(178);
				expresion();
				setState(179);
				exp_loop_helper();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public Print_loopContext print_loop() {
			return getRuleContext(Print_loopContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__18);
			setState(185);
			match(T__13);
			setState(186);
			print_loop();
			setState(187);
			match(T__14);
			setState(188);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_loopContext extends ParserRuleContext {
		public Print_argsContext print_args() {
			return getRuleContext(Print_argsContext.class,0);
		}
		public Print_loopContext print_loop() {
			return getRuleContext(Print_loopContext.class,0);
		}
		public Print_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterPrint_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitPrint_loop(this);
		}
	}

	public final Print_loopContext print_loop() throws RecognitionException {
		Print_loopContext _localctx = new Print_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			print_args();
			cuadruploPrint()
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(192);
				match(T__6);
				setState(193);
				print_loop();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_argsContext extends ParserRuleContext {
		public Token Cte_string;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode Cte_string() { return getToken(patitoParser.Cte_string, 0); }
		public Print_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterPrint_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitPrint_args(this);
		}
	}

	public final Print_argsContext print_args() throws RecognitionException {
		Print_argsContext _localctx = new Print_argsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print_args);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__22:
			case T__23:
			case Cte_int:
			case Cte_float:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				expresion();
				}
				break;
			case Cte_string:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((Print_argsContext)_localctx).Cte_string = match(Cte_string);
				pushOperand((((Print_argsContext)_localctx).Cte_string!=null?((Print_argsContext)_localctx).Cte_string.getText():null), '','string', 1, 0)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion_helperContext expresion_helper() {
			return getRuleContext(Expresion_helperContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			exp();
			setState(202);
			expresion_helper();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_helperContext extends ParserRuleContext {
		public Expresion_operatorContext expresion_operator;
		public Expresion_operatorContext expresion_operator() {
			return getRuleContext(Expresion_operatorContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExpresion_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExpresion_helper(this);
		}
	}

	public final Expresion_helperContext expresion_helper() throws RecognitionException {
		Expresion_helperContext _localctx = new Expresion_helperContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion_helper);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((Expresion_helperContext)_localctx).expresion_operator = expresion_operator();
				pushOperator((((Expresion_helperContext)_localctx).expresion_operator!=null?_input.getText(((Expresion_helperContext)_localctx).expresion_operator.start,((Expresion_helperContext)_localctx).expresion_operator.stop):null))
				setState(206);
				exp();
				cuadruploExpresion()
				}
				break;
			case T__1:
			case T__6:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_operatorContext extends ParserRuleContext {
		public Expresion_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExpresion_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExpresion_operator(this);
		}
	}

	public final Expresion_operatorContext expresion_operator() throws RecognitionException {
		Expresion_operatorContext _localctx = new Expresion_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresion_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp_helperContext exp_helper() {
			return getRuleContext(Exp_helperContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			termino();
			cuadruploTermino('+', '-')
			setState(216);
			exp_helper();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_helperContext extends ParserRuleContext {
		public Exp_operatorContext exp_operator;
		public Exp_operatorContext exp_operator() {
			return getRuleContext(Exp_operatorContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExp_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExp_helper(this);
		}
	}

	public final Exp_helperContext exp_helper() throws RecognitionException {
		Exp_helperContext _localctx = new Exp_helperContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp_helper);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				((Exp_helperContext)_localctx).exp_operator = exp_operator();
				pushOperator((((Exp_helperContext)_localctx).exp_operator!=null?_input.getText(((Exp_helperContext)_localctx).exp_operator.start,((Exp_helperContext)_localctx).exp_operator.stop):null))
				setState(220);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__14:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_operatorContext extends ParserRuleContext {
		public Exp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterExp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitExp_operator(this);
		}
	}

	public final Exp_operatorContext exp_operator() throws RecognitionException {
		Exp_operatorContext _localctx = new Exp_operatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino_helperContext termino_helper() {
			return getRuleContext(Termino_helperContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			factor();
			cuadruploTermino('*', '/')
			setState(229);
			termino_helper();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termino_helperContext extends ParserRuleContext {
		public Termino_operatorContext termino_operator;
		public Termino_operatorContext termino_operator() {
			return getRuleContext(Termino_operatorContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Termino_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterTermino_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitTermino_helper(this);
		}
	}

	public final Termino_helperContext termino_helper() throws RecognitionException {
		Termino_helperContext _localctx = new Termino_helperContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_termino_helper);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((Termino_helperContext)_localctx).termino_operator = termino_operator();
				pushOperator((((Termino_helperContext)_localctx).termino_operator!=null?_input.getText(((Termino_helperContext)_localctx).termino_operator.start,((Termino_helperContext)_localctx).termino_operator.stop):null))
				setState(233);
				termino();
				}
				break;
			case T__1:
			case T__6:
			case T__14:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termino_operatorContext extends ParserRuleContext {
		public Termino_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterTermino_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitTermino_operator(this);
		}
	}

	public final Termino_operatorContext termino_operator() throws RecognitionException {
		Termino_operatorContext _localctx = new Termino_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_termino_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Factor_argContext factor_arg() {
			return getRuleContext(Factor_argContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__13);
				pushOperator('(')
				setState(242);
				expresion();
				setState(243);
				match(T__14);
				popOperator()
				}
				break;
			case T__22:
			case T__23:
			case Cte_int:
			case Cte_float:
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				factor_arg();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_operatorContext extends ParserRuleContext {
		public Factor_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterFactor_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitFactor_operator(this);
		}
	}

	public final Factor_operatorContext factor_operator() throws RecognitionException {
		Factor_operatorContext _localctx = new Factor_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_argContext extends ParserRuleContext {
		public Factor_operatorContext factor_operator;
		public Token Id;
		public TerminalNode Id() { return getToken(patitoParser.Id, 0); }
		public Factor_operatorContext factor_operator() {
			return getRuleContext(Factor_operatorContext.class,0);
		}
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public Factor_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterFactor_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitFactor_arg(this);
		}
	}

	public final Factor_argContext factor_arg() throws RecognitionException {
		Factor_argContext _localctx = new Factor_argContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor_arg);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22 || _la==T__23) {
					{
					setState(251);
					((Factor_argContext)_localctx).factor_operator = factor_operator();
					}
				}

				setState(254);
				((Factor_argContext)_localctx).Id = match(Id);
				pushOperand((((Factor_argContext)_localctx).Id!=null?((Factor_argContext)_localctx).Id.getText():null), (((Factor_argContext)_localctx).factor_operator!=null?_input.getText(((Factor_argContext)_localctx).factor_operator.start,((Factor_argContext)_localctx).factor_operator.stop):null), '', 0, 0)
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				cte();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public Factor_operatorContext factor_operator;
		public Token Cte_int;
		public Token Cte_float;
		public TerminalNode Cte_int() { return getToken(patitoParser.Cte_int, 0); }
		public TerminalNode Cte_float() { return getToken(patitoParser.Cte_float, 0); }
		public Factor_operatorContext factor_operator() {
			return getRuleContext(Factor_operatorContext.class,0);
		}
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==T__23) {
				{
				setState(259);
				((CteContext)_localctx).factor_operator = factor_operator();
				}
			}

			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Cte_int:
				{
				setState(262);
				((CteContext)_localctx).Cte_int = match(Cte_int);
				pushOperand((((CteContext)_localctx).Cte_int!=null?((CteContext)_localctx).Cte_int.getText():null), (((CteContext)_localctx).factor_operator!=null?_input.getText(((CteContext)_localctx).factor_operator.start,((CteContext)_localctx).factor_operator.stop):null), 'int', 1, 0)
				}
				break;
			case Cte_float:
				{
				setState(264);
				((CteContext)_localctx).Cte_float = match(Cte_float);
				pushOperand((((CteContext)_localctx).Cte_float!=null?((CteContext)_localctx).Cte_float.getText():null), (((CteContext)_localctx).factor_operator!=null?_input.getText(((CteContext)_localctx).factor_operator.start,((CteContext)_localctx).factor_operator.stop):null), 'float', 1, 0)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public Token Id;
		public TerminalNode Id() { return getToken(patitoParser.Id, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Id_loopContext id_loop() {
			return getRuleContext(Id_loopContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__26);
			setState(269);
			((FuncContext)_localctx).Id = match(Id);
			addFunction((((FuncContext)_localctx).Id!=null?((FuncContext)_localctx).Id.getText():null), 'local')
			setState(271);
			match(T__13);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(272);
				id_loop();
				}
			}

			setState(275);
			match(T__14);
			setState(276);
			match(T__27);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(277);
				vars();
				}
			}

			quadStart((((FuncContext)_localctx).Id!=null?((FuncContext)_localctx).Id.getText():null))
			setState(281);
			body();
			quadEnd((((FuncContext)_localctx).Id!=null?((FuncContext)_localctx).Id.getText():null))
			setState(283);
			match(T__28);
			setState(284);
			match(T__1);
			deleteVarTable((((FuncContext)_localctx).Id!=null?((FuncContext)_localctx).Id.getText():null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_loopContext extends ParserRuleContext {
		public Token Id;
		public TypeContext type;
		public TerminalNode Id() { return getToken(patitoParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_loop_primeContext id_loop_prime() {
			return getRuleContext(Id_loop_primeContext.class,0);
		}
		public Id_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterId_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitId_loop(this);
		}
	}

	public final Id_loopContext id_loop() throws RecognitionException {
		Id_loopContext _localctx = new Id_loopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_id_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((Id_loopContext)_localctx).Id = match(Id);
			setState(288);
			match(T__5);
			setState(289);
			((Id_loopContext)_localctx).type = type();
			addVar((((Id_loopContext)_localctx).Id!=null?((Id_loopContext)_localctx).Id.getText():null), (((Id_loopContext)_localctx).type!=null?_input.getText(((Id_loopContext)_localctx).type.start,((Id_loopContext)_localctx).type.stop):null))
			setState(291);
			id_loop_prime();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_loop_primeContext extends ParserRuleContext {
		public Id_loopContext id_loop() {
			return getRuleContext(Id_loopContext.class,0);
		}
		public Id_loop_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_loop_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).enterId_loop_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof patitoListener ) ((patitoListener)listener).exitId_loop_prime(this);
		}
	}

	public final Id_loop_primeContext id_loop_prime() throws RecognitionException {
		Id_loop_primeContext _localctx = new Id_loop_primeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_id_loop_prime);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__6);
				setState(294);
				id_loop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u012b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0001\u0005"+
		"\u0001S\b\u0001\n\u0001\f\u0001V\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0004\u0002b\b\u0002\u000b\u0002\f\u0002c\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u0082\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u009a\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00b7\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00c3\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00c8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00d3\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u00e0\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00ed\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u00f8\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0003\u001e"+
		"\u00fd\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0102\b"+
		"\u001e\u0001\u001f\u0003\u001f\u0105\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u010b\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0112\b \u0001 \u0001 \u0001 \u0003 \u0117\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u0129\b\"\u0001\"\u0000\u0000"+
		"#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0004\u0001\u0000\b\t\u0001\u0000"+
		"\u0014\u0016\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001a\u0120\u0000"+
		"F\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004_\u0001"+
		"\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000"+
		"\u0000\np\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000ez\u0001"+
		"\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0083\u0001"+
		"\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u0099\u0001"+
		"\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u00a5\u0001"+
		"\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00b6\u0001"+
		"\u0000\u0000\u0000 \u00b8\u0001\u0000\u0000\u0000\"\u00be\u0001\u0000"+
		"\u0000\u0000$\u00c7\u0001\u0000\u0000\u0000&\u00c9\u0001\u0000\u0000\u0000"+
		"(\u00d2\u0001\u0000\u0000\u0000*\u00d4\u0001\u0000\u0000\u0000,\u00d6"+
		"\u0001\u0000\u0000\u0000.\u00df\u0001\u0000\u0000\u00000\u00e1\u0001\u0000"+
		"\u0000\u00002\u00e3\u0001\u0000\u0000\u00004\u00ec\u0001\u0000\u0000\u0000"+
		"6\u00ee\u0001\u0000\u0000\u00008\u00f7\u0001\u0000\u0000\u0000:\u00f9"+
		"\u0001\u0000\u0000\u0000<\u0101\u0001\u0000\u0000\u0000>\u0104\u0001\u0000"+
		"\u0000\u0000@\u010c\u0001\u0000\u0000\u0000B\u011f\u0001\u0000\u0000\u0000"+
		"D\u0128\u0001\u0000\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0005\u0000"+
		"\u0000\u0001H\u0001\u0001\u0000\u0000\u0000IJ\u0006\u0001\uffff\uffff"+
		"\u0000JK\u0005\u0001\u0000\u0000KL\u0005!\u0000\u0000LM\u0006\u0001\uffff"+
		"\uffff\u0000MO\u0005\u0002\u0000\u0000NP\u0003\u0004\u0002\u0000ON\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PT\u0001\u0000\u0000\u0000"+
		"QS\u0003@ \u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000T"+
		"R\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0006\u0001"+
		"\uffff\uffff\u0000YZ\u0003\f\u0006\u0000Z[\u0006\u0001\uffff\uffff\u0000"+
		"[\\\u0005\u0004\u0000\u0000\\]\u0006\u0001\uffff\uffff\u0000]^\u0006\u0001"+
		"\uffff\uffff\u0000^\u0003\u0001\u0000\u0000\u0000_a\u0005\u0005\u0000"+
		"\u0000`b\u0003\u0006\u0003\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0005"+
		"\u0001\u0000\u0000\u0000ef\u0003\b\u0004\u0000fg\u0005\u0006\u0000\u0000"+
		"gh\u0003\n\u0005\u0000hi\u0005\u0002\u0000\u0000ij\u0006\u0003\uffff\uffff"+
		"\u0000j\u0007\u0001\u0000\u0000\u0000kn\u0005!\u0000\u0000lm\u0005\u0007"+
		"\u0000\u0000mo\u0003\b\u0004\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o\t\u0001\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000q\u000b"+
		"\u0001\u0000\u0000\u0000rs\u0005\n\u0000\u0000st\u0003\u000e\u0007\u0000"+
		"tu\u0005\u000b\u0000\u0000u\r\u0001\u0000\u0000\u0000vw\u0003\u0010\b"+
		"\u0000wx\u0003\u000e\u0007\u0000x{\u0001\u0000\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000zv\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u000f"+
		"\u0001\u0000\u0000\u0000|\u0082\u0003\u0012\t\u0000}\u0082\u0003\u0014"+
		"\n\u0000~\u0082\u0003\u0018\f\u0000\u007f\u0082\u0003\u001a\r\u0000\u0080"+
		"\u0082\u0003 \u0010\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001"+
		"\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0011\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005!\u0000\u0000\u0084\u0085\u0006\t\uffff"+
		"\uffff\u0000\u0085\u0086\u0005\f\u0000\u0000\u0086\u0087\u0006\t\uffff"+
		"\uffff\u0000\u0087\u0088\u0003&\u0013\u0000\u0088\u0089\u0006\t\uffff"+
		"\uffff\u0000\u0089\u008a\u0005\u0002\u0000\u0000\u008a\u0013\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\r\u0000\u0000\u008c\u008d\u0005\u000e\u0000"+
		"\u0000\u008d\u008e\u0003&\u0013\u0000\u008e\u008f\u0005\u000f\u0000\u0000"+
		"\u008f\u0090\u0006\n\uffff\uffff\u0000\u0090\u0091\u0003\f\u0006\u0000"+
		"\u0091\u0092\u0003\u0016\u000b\u0000\u0092\u0093\u0005\u0002\u0000\u0000"+
		"\u0093\u0094\u0006\n\uffff\uffff\u0000\u0094\u0015\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0010\u0000\u0000\u0096\u0097\u0006\u000b\uffff\uffff"+
		"\u0000\u0097\u009a\u0003\f\u0006\u0000\u0098\u009a\u0001\u0000\u0000\u0000"+
		"\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0011\u0000\u0000"+
		"\u009c\u009d\u0006\f\uffff\uffff\u0000\u009d\u009e\u0003\f\u0006\u0000"+
		"\u009e\u009f\u0005\u0012\u0000\u0000\u009f\u00a0\u0005\u000e\u0000\u0000"+
		"\u00a0\u00a1\u0003&\u0013\u0000\u00a1\u00a2\u0006\f\uffff\uffff\u0000"+
		"\u00a2\u00a3\u0005\u000f\u0000\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000"+
		"\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005!\u0000\u0000\u00a6"+
		"\u00a7\u0005\u000e\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000\u00a8"+
		"\u00a9\u0005\u000f\u0000\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa"+
		"\u001b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003&\u0013\u0000\u00ac\u00ad"+
		"\u0003\u001e\u000f\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0007\u0000\u0000\u00b2\u00b3\u0003&\u0013\u0000\u00b3\u00b4\u0003"+
		"\u001e\u000f\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u001f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0013\u0000\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u00bb\u0003"+
		"\"\u0011\u0000\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u00bd\u0005\u0002"+
		"\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00bf\u0003$\u0012\u0000"+
		"\u00bf\u00c2\u0006\u0011\uffff\uffff\u0000\u00c0\u00c1\u0005\u0007\u0000"+
		"\u0000\u00c1\u00c3\u0003\"\u0011\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3#\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c8\u0003&\u0013\u0000\u00c5\u00c6\u0005 \u0000\u0000\u00c6\u00c8\u0006"+
		"\u0012\uffff\uffff\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8%\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		",\u0016\u0000\u00ca\u00cb\u0003(\u0014\u0000\u00cb\'\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0003*\u0015\u0000\u00cd\u00ce\u0006\u0014\uffff\uffff"+
		"\u0000\u00ce\u00cf\u0003,\u0016\u0000\u00cf\u00d0\u0006\u0014\uffff\uffff"+
		"\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3)\u0001\u0000\u0000\u0000\u00d4\u00d5\u0007\u0001\u0000\u0000"+
		"\u00d5+\u0001\u0000\u0000\u0000\u00d6\u00d7\u00032\u0019\u0000\u00d7\u00d8"+
		"\u0006\u0016\uffff\uffff\u0000\u00d8\u00d9\u0003.\u0017\u0000\u00d9-\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u00030\u0018\u0000\u00db\u00dc\u0006\u0017"+
		"\uffff\uffff\u0000\u00dc\u00dd\u0003,\u0016\u0000\u00dd\u00e0\u0001\u0000"+
		"\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000"+
		"\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0/\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0007\u0002\u0000\u0000\u00e21\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u00038\u001c\u0000\u00e4\u00e5\u0006\u0019\uffff\uffff\u0000"+
		"\u00e5\u00e6\u00034\u001a\u0000\u00e63\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u00036\u001b\u0000\u00e8\u00e9\u0006\u001a\uffff\uffff\u0000\u00e9\u00ea"+
		"\u00032\u0019\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e7\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed5\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007\u0003"+
		"\u0000\u0000\u00ef7\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u000e\u0000"+
		"\u0000\u00f1\u00f2\u0006\u001c\uffff\uffff\u0000\u00f2\u00f3\u0003&\u0013"+
		"\u0000\u00f3\u00f4\u0005\u000f\u0000\u0000\u00f4\u00f5\u0006\u001c\uffff"+
		"\uffff\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003<\u001e"+
		"\u0000\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f89\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0002\u0000\u0000"+
		"\u00fa;\u0001\u0000\u0000\u0000\u00fb\u00fd\u0003:\u001d\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005!\u0000\u0000\u00ff\u0102\u0006"+
		"\u001e\uffff\uffff\u0000\u0100\u0102\u0003>\u001f\u0000\u0101\u00fc\u0001"+
		"\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102=\u0001\u0000"+
		"\u0000\u0000\u0103\u0105\u0003:\u001d\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u010a\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005\u001e\u0000\u0000\u0107\u010b\u0006\u001f\uffff"+
		"\uffff\u0000\u0108\u0109\u0005\u001f\u0000\u0000\u0109\u010b\u0006\u001f"+
		"\uffff\uffff\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010b?\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u001b"+
		"\u0000\u0000\u010d\u010e\u0005!\u0000\u0000\u010e\u010f\u0006 \uffff\uffff"+
		"\u0000\u010f\u0111\u0005\u000e\u0000\u0000\u0110\u0112\u0003B!\u0000\u0111"+
		"\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u000f\u0000\u0000\u0114"+
		"\u0116\u0005\u001c\u0000\u0000\u0115\u0117\u0003\u0004\u0002\u0000\u0116"+
		"\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0006 \uffff\uffff\u0000\u0119"+
		"\u011a\u0003\f\u0006\u0000\u011a\u011b\u0006 \uffff\uffff\u0000\u011b"+
		"\u011c\u0005\u001d\u0000\u0000\u011c\u011d\u0005\u0002\u0000\u0000\u011d"+
		"\u011e\u0006 \uffff\uffff\u0000\u011eA\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0005!\u0000\u0000\u0120\u0121\u0005\u0006\u0000\u0000\u0121\u0122\u0003"+
		"\n\u0005\u0000\u0122\u0123\u0006!\uffff\uffff\u0000\u0123\u0124\u0003"+
		"D\"\u0000\u0124C\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0007\u0000"+
		"\u0000\u0126\u0129\u0003B!\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128"+
		"\u0125\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129"+
		"E\u0001\u0000\u0000\u0000\u0016OTcnz\u0081\u0099\u00af\u00b6\u00c2\u00c7"+
		"\u00d2\u00df\u00ec\u00f7\u00fc\u0101\u0104\u010a\u0111\u0116\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}