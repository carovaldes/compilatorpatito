# Generated from patito.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


from symbolTable import *
from virtualMachine import *

def serializedATN():
    return [
        4,1,34,299,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,3,1,80,8,1,1,
        1,5,1,83,8,1,10,1,12,1,86,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        2,1,2,4,2,98,8,2,11,2,12,2,99,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,
        4,3,4,111,8,4,1,5,1,5,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,3,7,123,8,
        7,1,8,1,8,1,8,1,8,1,8,3,8,130,8,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,
        9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,
        11,1,11,3,11,154,8,11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,
        12,1,12,1,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,3,14,176,
        8,14,1,15,1,15,1,15,1,15,1,15,3,15,183,8,15,1,16,1,16,1,16,1,16,
        1,16,1,16,1,17,1,17,1,17,1,17,3,17,195,8,17,1,18,1,18,1,18,3,18,
        200,8,18,1,19,1,19,1,19,1,20,1,20,1,20,1,20,1,20,1,20,3,20,211,8,
        20,1,21,1,21,1,22,1,22,1,22,1,22,1,23,1,23,1,23,1,23,1,23,3,23,224,
        8,23,1,24,1,24,1,25,1,25,1,25,1,25,1,26,1,26,1,26,1,26,1,26,3,26,
        237,8,26,1,27,1,27,1,28,1,28,1,28,1,28,1,28,1,28,1,28,3,28,248,8,
        28,1,29,1,29,1,30,3,30,253,8,30,1,30,1,30,1,30,3,30,258,8,30,1,31,
        3,31,261,8,31,1,31,1,31,1,31,1,31,3,31,267,8,31,1,32,1,32,1,32,1,
        32,1,32,3,32,274,8,32,1,32,1,32,1,32,3,32,279,8,32,1,32,1,32,1,32,
        1,32,1,32,1,32,1,32,1,33,1,33,1,33,1,33,1,33,1,33,1,34,1,34,1,34,
        3,34,297,8,34,1,34,0,0,35,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,
        30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,0,4,
        1,0,8,9,1,0,20,22,1,0,23,24,1,0,25,26,288,0,70,1,0,0,0,2,73,1,0,
        0,0,4,95,1,0,0,0,6,101,1,0,0,0,8,107,1,0,0,0,10,112,1,0,0,0,12,114,
        1,0,0,0,14,122,1,0,0,0,16,129,1,0,0,0,18,131,1,0,0,0,20,139,1,0,
        0,0,22,153,1,0,0,0,24,155,1,0,0,0,26,165,1,0,0,0,28,175,1,0,0,0,
        30,182,1,0,0,0,32,184,1,0,0,0,34,190,1,0,0,0,36,199,1,0,0,0,38,201,
        1,0,0,0,40,210,1,0,0,0,42,212,1,0,0,0,44,214,1,0,0,0,46,223,1,0,
        0,0,48,225,1,0,0,0,50,227,1,0,0,0,52,236,1,0,0,0,54,238,1,0,0,0,
        56,247,1,0,0,0,58,249,1,0,0,0,60,257,1,0,0,0,62,260,1,0,0,0,64,268,
        1,0,0,0,66,287,1,0,0,0,68,296,1,0,0,0,70,71,3,2,1,0,71,72,5,0,0,
        1,72,1,1,0,0,0,73,74,6,1,-1,0,74,75,5,1,0,0,75,76,5,33,0,0,76,77,
        6,1,-1,0,77,79,5,2,0,0,78,80,3,4,2,0,79,78,1,0,0,0,79,80,1,0,0,0,
        80,84,1,0,0,0,81,83,3,64,32,0,82,81,1,0,0,0,83,86,1,0,0,0,84,82,
        1,0,0,0,84,85,1,0,0,0,85,87,1,0,0,0,86,84,1,0,0,0,87,88,5,3,0,0,
        88,89,6,1,-1,0,89,90,3,12,6,0,90,91,6,1,-1,0,91,92,5,4,0,0,92,93,
        6,1,-1,0,93,94,6,1,-1,0,94,3,1,0,0,0,95,97,5,5,0,0,96,98,3,6,3,0,
        97,96,1,0,0,0,98,99,1,0,0,0,99,97,1,0,0,0,99,100,1,0,0,0,100,5,1,
        0,0,0,101,102,3,8,4,0,102,103,5,6,0,0,103,104,3,10,5,0,104,105,5,
        2,0,0,105,106,6,3,-1,0,106,7,1,0,0,0,107,110,5,33,0,0,108,109,5,
        7,0,0,109,111,3,8,4,0,110,108,1,0,0,0,110,111,1,0,0,0,111,9,1,0,
        0,0,112,113,7,0,0,0,113,11,1,0,0,0,114,115,5,10,0,0,115,116,3,14,
        7,0,116,117,5,11,0,0,117,13,1,0,0,0,118,119,3,16,8,0,119,120,3,14,
        7,0,120,123,1,0,0,0,121,123,1,0,0,0,122,118,1,0,0,0,122,121,1,0,
        0,0,123,15,1,0,0,0,124,130,3,18,9,0,125,130,3,20,10,0,126,130,3,
        24,12,0,127,130,3,26,13,0,128,130,3,32,16,0,129,124,1,0,0,0,129,
        125,1,0,0,0,129,126,1,0,0,0,129,127,1,0,0,0,129,128,1,0,0,0,130,
        17,1,0,0,0,131,132,5,33,0,0,132,133,6,9,-1,0,133,134,5,12,0,0,134,
        135,6,9,-1,0,135,136,3,38,19,0,136,137,6,9,-1,0,137,138,5,2,0,0,
        138,19,1,0,0,0,139,140,5,13,0,0,140,141,5,14,0,0,141,142,3,38,19,
        0,142,143,5,15,0,0,143,144,6,10,-1,0,144,145,3,12,6,0,145,146,3,
        22,11,0,146,147,5,2,0,0,147,148,6,10,-1,0,148,21,1,0,0,0,149,150,
        5,16,0,0,150,151,6,11,-1,0,151,154,3,12,6,0,152,154,1,0,0,0,153,
        149,1,0,0,0,153,152,1,0,0,0,154,23,1,0,0,0,155,156,5,17,0,0,156,
        157,6,12,-1,0,157,158,3,12,6,0,158,159,5,18,0,0,159,160,5,14,0,0,
        160,161,3,38,19,0,161,162,6,12,-1,0,162,163,5,15,0,0,163,164,5,2,
        0,0,164,25,1,0,0,0,165,166,5,33,0,0,166,167,5,14,0,0,167,168,3,28,
        14,0,168,169,5,15,0,0,169,170,5,2,0,0,170,27,1,0,0,0,171,172,3,38,
        19,0,172,173,3,30,15,0,173,176,1,0,0,0,174,176,1,0,0,0,175,171,1,
        0,0,0,175,174,1,0,0,0,176,29,1,0,0,0,177,178,5,7,0,0,178,179,3,38,
        19,0,179,180,3,30,15,0,180,183,1,0,0,0,181,183,1,0,0,0,182,177,1,
        0,0,0,182,181,1,0,0,0,183,31,1,0,0,0,184,185,5,19,0,0,185,186,5,
        14,0,0,186,187,3,34,17,0,187,188,5,15,0,0,188,189,5,2,0,0,189,33,
        1,0,0,0,190,191,3,36,18,0,191,194,6,17,-1,0,192,193,5,7,0,0,193,
        195,3,34,17,0,194,192,1,0,0,0,194,195,1,0,0,0,195,35,1,0,0,0,196,
        200,3,38,19,0,197,198,5,32,0,0,198,200,6,18,-1,0,199,196,1,0,0,0,
        199,197,1,0,0,0,200,37,1,0,0,0,201,202,3,44,22,0,202,203,3,40,20,
        0,203,39,1,0,0,0,204,205,3,42,21,0,205,206,6,20,-1,0,206,207,3,44,
        22,0,207,208,6,20,-1,0,208,211,1,0,0,0,209,211,1,0,0,0,210,204,1,
        0,0,0,210,209,1,0,0,0,211,41,1,0,0,0,212,213,7,1,0,0,213,43,1,0,
        0,0,214,215,3,50,25,0,215,216,6,22,-1,0,216,217,3,46,23,0,217,45,
        1,0,0,0,218,219,3,48,24,0,219,220,6,23,-1,0,220,221,3,44,22,0,221,
        224,1,0,0,0,222,224,1,0,0,0,223,218,1,0,0,0,223,222,1,0,0,0,224,
        47,1,0,0,0,225,226,7,2,0,0,226,49,1,0,0,0,227,228,3,56,28,0,228,
        229,6,25,-1,0,229,230,3,52,26,0,230,51,1,0,0,0,231,232,3,54,27,0,
        232,233,6,26,-1,0,233,234,3,50,25,0,234,237,1,0,0,0,235,237,1,0,
        0,0,236,231,1,0,0,0,236,235,1,0,0,0,237,53,1,0,0,0,238,239,7,3,0,
        0,239,55,1,0,0,0,240,241,5,14,0,0,241,242,6,28,-1,0,242,243,3,38,
        19,0,243,244,5,15,0,0,244,245,6,28,-1,0,245,248,1,0,0,0,246,248,
        3,60,30,0,247,240,1,0,0,0,247,246,1,0,0,0,248,57,1,0,0,0,249,250,
        7,2,0,0,250,59,1,0,0,0,251,253,3,58,29,0,252,251,1,0,0,0,252,253,
        1,0,0,0,253,254,1,0,0,0,254,255,5,33,0,0,255,258,6,30,-1,0,256,258,
        3,62,31,0,257,252,1,0,0,0,257,256,1,0,0,0,258,61,1,0,0,0,259,261,
        3,58,29,0,260,259,1,0,0,0,260,261,1,0,0,0,261,266,1,0,0,0,262,263,
        5,30,0,0,263,267,6,31,-1,0,264,265,5,31,0,0,265,267,6,31,-1,0,266,
        262,1,0,0,0,266,264,1,0,0,0,267,63,1,0,0,0,268,269,5,27,0,0,269,
        270,5,33,0,0,270,271,6,32,-1,0,271,273,5,14,0,0,272,274,3,66,33,
        0,273,272,1,0,0,0,273,274,1,0,0,0,274,275,1,0,0,0,275,276,5,15,0,
        0,276,278,5,28,0,0,277,279,3,4,2,0,278,277,1,0,0,0,278,279,1,0,0,
        0,279,280,1,0,0,0,280,281,6,32,-1,0,281,282,3,12,6,0,282,283,6,32,
        -1,0,283,284,5,29,0,0,284,285,5,2,0,0,285,286,6,32,-1,0,286,65,1,
        0,0,0,287,288,5,33,0,0,288,289,5,6,0,0,289,290,3,10,5,0,290,291,
        6,33,-1,0,291,292,3,68,34,0,292,67,1,0,0,0,293,294,5,7,0,0,294,297,
        3,66,33,0,295,297,1,0,0,0,296,293,1,0,0,0,296,295,1,0,0,0,297,69,
        1,0,0,0,22,79,84,99,110,122,129,153,175,182,194,199,210,223,236,
        247,252,257,260,266,273,278,296
    ]

class patitoParser ( Parser ):

    grammarFileName = "patito.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'program'", "';'", "'main'", "'end'", 
                     "'var'", "':'", "','", "'int'", "'float'", "'{'", "'}'", 
                     "'='", "'if'", "'('", "')'", "'else'", "'while'", "'do'", 
                     "'print'", "'>'", "'<'", "'!='", "'+'", "'-'", "'*'", 
                     "'/'", "'void'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "Cte_int", "Cte_float", 
                      "Cte_string", "Id", "WS" ]

    RULE_start = 0
    RULE_programa = 1
    RULE_vars = 2
    RULE_list_var = 3
    RULE_list_id = 4
    RULE_type = 5
    RULE_body = 6
    RULE_statement_loop = 7
    RULE_statement = 8
    RULE_assign = 9
    RULE_condition = 10
    RULE_else = 11
    RULE_cycle = 12
    RULE_f_call = 13
    RULE_exp_loop = 14
    RULE_exp_loop_helper = 15
    RULE_print = 16
    RULE_print_loop = 17
    RULE_print_args = 18
    RULE_expresion = 19
    RULE_expresion_helper = 20
    RULE_expresion_operator = 21
    RULE_exp = 22
    RULE_exp_helper = 23
    RULE_exp_operator = 24
    RULE_termino = 25
    RULE_termino_helper = 26
    RULE_termino_operator = 27
    RULE_factor = 28
    RULE_factor_operator = 29
    RULE_factor_arg = 30
    RULE_cte = 31
    RULE_func = 32
    RULE_id_loop = 33
    RULE_id_loop_prime = 34

    ruleNames =  [ "start", "programa", "vars", "list_var", "list_id", "type", 
                   "body", "statement_loop", "statement", "assign", "condition", 
                   "else", "cycle", "f_call", "exp_loop", "exp_loop_helper", 
                   "print", "print_loop", "print_args", "expresion", "expresion_helper", 
                   "expresion_operator", "exp", "exp_helper", "exp_operator", 
                   "termino", "termino_helper", "termino_operator", "factor", 
                   "factor_operator", "factor_arg", "cte", "func", "id_loop", 
                   "id_loop_prime" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    Cte_int=30
    Cte_float=31
    Cte_string=32
    Id=33
    WS=34

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def programa(self):
            return self.getTypedRuleContext(patitoParser.ProgramaContext,0)


        def EOF(self):
            return self.getToken(patitoParser.EOF, 0)

        def getRuleIndex(self):
            return patitoParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = patitoParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.programa()
            self.state = 71
            self.match(patitoParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._Id = None # Token

        def Id(self):
            return self.getToken(patitoParser.Id, 0)

        def body(self):
            return self.getTypedRuleContext(patitoParser.BodyContext,0)


        def vars_(self):
            return self.getTypedRuleContext(patitoParser.VarsContext,0)


        def func(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(patitoParser.FuncContext)
            else:
                return self.getTypedRuleContext(patitoParser.FuncContext,i)


        def getRuleIndex(self):
            return patitoParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)




    def programa(self):

        localctx = patitoParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            pushMain()
            self.state = 74
            self.match(patitoParser.T__0)
            self.state = 75
            localctx._Id = self.match(patitoParser.Id)
            addFunction((None if localctx._Id is None else localctx._Id.text), 'global')
            self.state = 77
            self.match(patitoParser.T__1)
            self.state = 79
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 78
                self.vars_()


            self.state = 84
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==27:
                self.state = 81
                self.func()
                self.state = 86
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 87
            self.match(patitoParser.T__2)
            quadruploMain()
            self.state = 89
            self.body()
            imprime()
            self.state = 91
            self.match(patitoParser.T__3)
            runVm()
            deleteAll()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def list_var(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(patitoParser.List_varContext)
            else:
                return self.getTypedRuleContext(patitoParser.List_varContext,i)


        def getRuleIndex(self):
            return patitoParser.RULE_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVars" ):
                listener.enterVars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVars" ):
                listener.exitVars(self)




    def vars_(self):

        localctx = patitoParser.VarsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_vars)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.match(patitoParser.T__4)
            self.state = 97 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 96
                self.list_var()
                self.state = 99 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==33):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_varContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._list_id = None # List_idContext
            self._type = None # TypeContext

        def list_id(self):
            return self.getTypedRuleContext(patitoParser.List_idContext,0)


        def type_(self):
            return self.getTypedRuleContext(patitoParser.TypeContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_list_var

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_var" ):
                listener.enterList_var(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_var" ):
                listener.exitList_var(self)




    def list_var(self):

        localctx = patitoParser.List_varContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_list_var)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 101
            localctx._list_id = self.list_id()
            self.state = 102
            self.match(patitoParser.T__5)
            self.state = 103
            localctx._type = self.type_()
            self.state = 104
            self.match(patitoParser.T__1)
            addVar((None if localctx._list_id is None else self._input.getText(localctx._list_id.start,localctx._list_id.stop)), (None if localctx._type is None else self._input.getText(localctx._type.start,localctx._type.stop)))
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class List_idContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Id(self):
            return self.getToken(patitoParser.Id, 0)

        def list_id(self):
            return self.getTypedRuleContext(patitoParser.List_idContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_list_id

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList_id" ):
                listener.enterList_id(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList_id" ):
                listener.exitList_id(self)




    def list_id(self):

        localctx = patitoParser.List_idContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_list_id)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 107
            self.match(patitoParser.Id)
            self.state = 110
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==7:
                self.state = 108
                self.match(patitoParser.T__6)
                self.state = 109
                self.list_id()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return patitoParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)




    def type_(self):

        localctx = patitoParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 112
            _la = self._input.LA(1)
            if not(_la==8 or _la==9):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement_loop(self):
            return self.getTypedRuleContext(patitoParser.Statement_loopContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_body

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBody" ):
                listener.enterBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBody" ):
                listener.exitBody(self)




    def body(self):

        localctx = patitoParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_body)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(patitoParser.T__9)
            self.state = 115
            self.statement_loop()
            self.state = 116
            self.match(patitoParser.T__10)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Statement_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self):
            return self.getTypedRuleContext(patitoParser.StatementContext,0)


        def statement_loop(self):
            return self.getTypedRuleContext(patitoParser.Statement_loopContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_statement_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement_loop" ):
                listener.enterStatement_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement_loop" ):
                listener.exitStatement_loop(self)




    def statement_loop(self):

        localctx = patitoParser.Statement_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_statement_loop)
        try:
            self.state = 122
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 17, 19, 33]:
                self.enterOuterAlt(localctx, 1)
                self.state = 118
                self.statement()
                self.state = 119
                self.statement_loop()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assign(self):
            return self.getTypedRuleContext(patitoParser.AssignContext,0)


        def condition(self):
            return self.getTypedRuleContext(patitoParser.ConditionContext,0)


        def cycle(self):
            return self.getTypedRuleContext(patitoParser.CycleContext,0)


        def f_call(self):
            return self.getTypedRuleContext(patitoParser.F_callContext,0)


        def print_(self):
            return self.getTypedRuleContext(patitoParser.PrintContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = patitoParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_statement)
        try:
            self.state = 129
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 124
                self.assign()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 125
                self.condition()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 126
                self.cycle()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 127
                self.f_call()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 128
                self.print_()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._Id = None # Token

        def Id(self):
            return self.getToken(patitoParser.Id, 0)

        def expresion(self):
            return self.getTypedRuleContext(patitoParser.ExpresionContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)




    def assign(self):

        localctx = patitoParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 131
            localctx._Id = self.match(patitoParser.Id)
            pushOperand((None if localctx._Id is None else localctx._Id.text), '', '', 0, 0)
            self.state = 133
            self.match(patitoParser.T__11)
            pushOperator('=')
            self.state = 135
            self.expresion()
            cuadruploAssign()
            self.state = 137
            self.match(patitoParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(patitoParser.ExpresionContext,0)


        def body(self):
            return self.getTypedRuleContext(patitoParser.BodyContext,0)


        def else_(self):
            return self.getTypedRuleContext(patitoParser.ElseContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)




    def condition(self):

        localctx = patitoParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 139
            self.match(patitoParser.T__12)
            self.state = 140
            self.match(patitoParser.T__13)
            self.state = 141
            self.expresion()
            self.state = 142
            self.match(patitoParser.T__14)
            ifElse1()
            self.state = 144
            self.body()
            self.state = 145
            self.else_()
            self.state = 146
            self.match(patitoParser.T__1)
            ifElse2()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(patitoParser.BodyContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_else

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElse" ):
                listener.enterElse(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElse" ):
                listener.exitElse(self)




    def else_(self):

        localctx = patitoParser.ElseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_else)
        try:
            self.state = 153
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 149
                self.match(patitoParser.T__15)
                ifElse3()
                self.state = 151
                self.body()
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CycleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(patitoParser.BodyContext,0)


        def expresion(self):
            return self.getTypedRuleContext(patitoParser.ExpresionContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_cycle

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCycle" ):
                listener.enterCycle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCycle" ):
                listener.exitCycle(self)




    def cycle(self):

        localctx = patitoParser.CycleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_cycle)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 155
            self.match(patitoParser.T__16)
            pushCont()
            self.state = 157
            self.body()
            self.state = 158
            self.match(patitoParser.T__17)
            self.state = 159
            self.match(patitoParser.T__13)
            self.state = 160
            self.expresion()
            returnWhile()
            self.state = 162
            self.match(patitoParser.T__14)
            self.state = 163
            self.match(patitoParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class F_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Id(self):
            return self.getToken(patitoParser.Id, 0)

        def exp_loop(self):
            return self.getTypedRuleContext(patitoParser.Exp_loopContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_f_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterF_call" ):
                listener.enterF_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitF_call" ):
                listener.exitF_call(self)




    def f_call(self):

        localctx = patitoParser.F_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_f_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 165
            self.match(patitoParser.Id)
            self.state = 166
            self.match(patitoParser.T__13)
            self.state = 167
            self.exp_loop()
            self.state = 168
            self.match(patitoParser.T__14)
            self.state = 169
            self.match(patitoParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(patitoParser.ExpresionContext,0)


        def exp_loop_helper(self):
            return self.getTypedRuleContext(patitoParser.Exp_loop_helperContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_exp_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp_loop" ):
                listener.enterExp_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp_loop" ):
                listener.exitExp_loop(self)




    def exp_loop(self):

        localctx = patitoParser.Exp_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_exp_loop)
        try:
            self.state = 175
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 23, 24, 30, 31, 33]:
                self.enterOuterAlt(localctx, 1)
                self.state = 171
                self.expresion()
                self.state = 172
                self.exp_loop_helper()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp_loop_helperContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(patitoParser.ExpresionContext,0)


        def exp_loop_helper(self):
            return self.getTypedRuleContext(patitoParser.Exp_loop_helperContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_exp_loop_helper

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp_loop_helper" ):
                listener.enterExp_loop_helper(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp_loop_helper" ):
                listener.exitExp_loop_helper(self)




    def exp_loop_helper(self):

        localctx = patitoParser.Exp_loop_helperContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_exp_loop_helper)
        try:
            self.state = 182
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 177
                self.match(patitoParser.T__6)
                self.state = 178
                self.expresion()
                self.state = 179
                self.exp_loop_helper()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def print_loop(self):
            return self.getTypedRuleContext(patitoParser.Print_loopContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint" ):
                listener.enterPrint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint" ):
                listener.exitPrint(self)




    def print_(self):

        localctx = patitoParser.PrintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_print)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 184
            self.match(patitoParser.T__18)
            self.state = 185
            self.match(patitoParser.T__13)
            self.state = 186
            self.print_loop()
            self.state = 187
            self.match(patitoParser.T__14)
            self.state = 188
            self.match(patitoParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Print_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def print_args(self):
            return self.getTypedRuleContext(patitoParser.Print_argsContext,0)


        def print_loop(self):
            return self.getTypedRuleContext(patitoParser.Print_loopContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_print_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint_loop" ):
                listener.enterPrint_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint_loop" ):
                listener.exitPrint_loop(self)




    def print_loop(self):

        localctx = patitoParser.Print_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_print_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 190
            self.print_args()
            cuadruploPrint()
            self.state = 194
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==7:
                self.state = 192
                self.match(patitoParser.T__6)
                self.state = 193
                self.print_loop()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Print_argsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._Cte_string = None # Token

        def expresion(self):
            return self.getTypedRuleContext(patitoParser.ExpresionContext,0)


        def Cte_string(self):
            return self.getToken(patitoParser.Cte_string, 0)

        def getRuleIndex(self):
            return patitoParser.RULE_print_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint_args" ):
                listener.enterPrint_args(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint_args" ):
                listener.exitPrint_args(self)




    def print_args(self):

        localctx = patitoParser.Print_argsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_print_args)
        try:
            self.state = 199
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 23, 24, 30, 31, 33]:
                self.enterOuterAlt(localctx, 1)
                self.state = 196
                self.expresion()
                pass
            elif token in [32]:
                self.enterOuterAlt(localctx, 2)
                self.state = 197
                localctx._Cte_string = self.match(patitoParser.Cte_string)
                pushOperand((None if localctx._Cte_string is None else localctx._Cte_string.text), '','string', 1, 0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(patitoParser.ExpContext,0)


        def expresion_helper(self):
            return self.getTypedRuleContext(patitoParser.Expresion_helperContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_expresion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion" ):
                listener.enterExpresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion" ):
                listener.exitExpresion(self)




    def expresion(self):

        localctx = patitoParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_expresion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 201
            self.exp()
            self.state = 202
            self.expresion_helper()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expresion_helperContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._expresion_operator = None # Expresion_operatorContext

        def expresion_operator(self):
            return self.getTypedRuleContext(patitoParser.Expresion_operatorContext,0)


        def exp(self):
            return self.getTypedRuleContext(patitoParser.ExpContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_expresion_helper

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion_helper" ):
                listener.enterExpresion_helper(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion_helper" ):
                listener.exitExpresion_helper(self)




    def expresion_helper(self):

        localctx = patitoParser.Expresion_helperContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_expresion_helper)
        try:
            self.state = 210
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20, 21, 22]:
                self.enterOuterAlt(localctx, 1)
                self.state = 204
                localctx._expresion_operator = self.expresion_operator()
                pushOperator((None if localctx._expresion_operator is None else self._input.getText(localctx._expresion_operator.start,localctx._expresion_operator.stop)))
                self.state = 206
                self.exp()
                cuadruploExpresion()
                pass
            elif token in [2, 7, 15]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expresion_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return patitoParser.RULE_expresion_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion_operator" ):
                listener.enterExpresion_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion_operator" ):
                listener.exitExpresion_operator(self)




    def expresion_operator(self):

        localctx = patitoParser.Expresion_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_expresion_operator)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 212
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7340032) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termino(self):
            return self.getTypedRuleContext(patitoParser.TerminoContext,0)


        def exp_helper(self):
            return self.getTypedRuleContext(patitoParser.Exp_helperContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp" ):
                listener.enterExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp" ):
                listener.exitExp(self)




    def exp(self):

        localctx = patitoParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_exp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 214
            self.termino()
            cuadruploTermino('+', '-')
            self.state = 216
            self.exp_helper()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp_helperContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._exp_operator = None # Exp_operatorContext

        def exp_operator(self):
            return self.getTypedRuleContext(patitoParser.Exp_operatorContext,0)


        def exp(self):
            return self.getTypedRuleContext(patitoParser.ExpContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_exp_helper

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp_helper" ):
                listener.enterExp_helper(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp_helper" ):
                listener.exitExp_helper(self)




    def exp_helper(self):

        localctx = patitoParser.Exp_helperContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_exp_helper)
        try:
            self.state = 223
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [23, 24]:
                self.enterOuterAlt(localctx, 1)
                self.state = 218
                localctx._exp_operator = self.exp_operator()
                pushOperator((None if localctx._exp_operator is None else self._input.getText(localctx._exp_operator.start,localctx._exp_operator.stop)))
                self.state = 220
                self.exp()
                pass
            elif token in [2, 7, 15, 20, 21, 22]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return patitoParser.RULE_exp_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp_operator" ):
                listener.enterExp_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp_operator" ):
                listener.exitExp_operator(self)




    def exp_operator(self):

        localctx = patitoParser.Exp_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_exp_operator)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 225
            _la = self._input.LA(1)
            if not(_la==23 or _la==24):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TerminoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self):
            return self.getTypedRuleContext(patitoParser.FactorContext,0)


        def termino_helper(self):
            return self.getTypedRuleContext(patitoParser.Termino_helperContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_termino

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermino" ):
                listener.enterTermino(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermino" ):
                listener.exitTermino(self)




    def termino(self):

        localctx = patitoParser.TerminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_termino)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 227
            self.factor()
            cuadruploTermino('*', '/')
            self.state = 229
            self.termino_helper()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Termino_helperContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._termino_operator = None # Termino_operatorContext

        def termino_operator(self):
            return self.getTypedRuleContext(patitoParser.Termino_operatorContext,0)


        def termino(self):
            return self.getTypedRuleContext(patitoParser.TerminoContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_termino_helper

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermino_helper" ):
                listener.enterTermino_helper(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermino_helper" ):
                listener.exitTermino_helper(self)




    def termino_helper(self):

        localctx = patitoParser.Termino_helperContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_termino_helper)
        try:
            self.state = 236
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [25, 26]:
                self.enterOuterAlt(localctx, 1)
                self.state = 231
                localctx._termino_operator = self.termino_operator()
                pushOperator((None if localctx._termino_operator is None else self._input.getText(localctx._termino_operator.start,localctx._termino_operator.stop)))
                self.state = 233
                self.termino()
                pass
            elif token in [2, 7, 15, 20, 21, 22, 23, 24]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Termino_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return patitoParser.RULE_termino_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermino_operator" ):
                listener.enterTermino_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermino_operator" ):
                listener.exitTermino_operator(self)




    def termino_operator(self):

        localctx = patitoParser.Termino_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_termino_operator)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 238
            _la = self._input.LA(1)
            if not(_la==25 or _la==26):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(patitoParser.ExpresionContext,0)


        def factor_arg(self):
            return self.getTypedRuleContext(patitoParser.Factor_argContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)




    def factor(self):

        localctx = patitoParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_factor)
        try:
            self.state = 247
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 240
                self.match(patitoParser.T__13)
                pushOperator('(')
                self.state = 242
                self.expresion()
                self.state = 243
                self.match(patitoParser.T__14)
                popOperator()
                pass
            elif token in [23, 24, 30, 31, 33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 246
                self.factor_arg()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Factor_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return patitoParser.RULE_factor_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor_operator" ):
                listener.enterFactor_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor_operator" ):
                listener.exitFactor_operator(self)




    def factor_operator(self):

        localctx = patitoParser.Factor_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_factor_operator)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 249
            _la = self._input.LA(1)
            if not(_la==23 or _la==24):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Factor_argContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._factor_operator = None # Factor_operatorContext
            self._Id = None # Token

        def Id(self):
            return self.getToken(patitoParser.Id, 0)

        def factor_operator(self):
            return self.getTypedRuleContext(patitoParser.Factor_operatorContext,0)


        def cte(self):
            return self.getTypedRuleContext(patitoParser.CteContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_factor_arg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor_arg" ):
                listener.enterFactor_arg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor_arg" ):
                listener.exitFactor_arg(self)




    def factor_arg(self):

        localctx = patitoParser.Factor_argContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_factor_arg)
        self._la = 0 # Token type
        try:
            self.state = 257
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 252
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==23 or _la==24:
                    self.state = 251
                    localctx._factor_operator = self.factor_operator()


                self.state = 254
                localctx._Id = self.match(patitoParser.Id)
                pushOperand((None if localctx._Id is None else localctx._Id.text), (None if localctx._factor_operator is None else self._input.getText(localctx._factor_operator.start,localctx._factor_operator.stop)), '', 0, 0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 256
                self.cte()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._factor_operator = None # Factor_operatorContext
            self._Cte_int = None # Token
            self._Cte_float = None # Token

        def Cte_int(self):
            return self.getToken(patitoParser.Cte_int, 0)

        def Cte_float(self):
            return self.getToken(patitoParser.Cte_float, 0)

        def factor_operator(self):
            return self.getTypedRuleContext(patitoParser.Factor_operatorContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_cte

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCte" ):
                listener.enterCte(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCte" ):
                listener.exitCte(self)




    def cte(self):

        localctx = patitoParser.CteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_cte)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 260
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==23 or _la==24:
                self.state = 259
                localctx._factor_operator = self.factor_operator()


            self.state = 266
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [30]:
                self.state = 262
                localctx._Cte_int = self.match(patitoParser.Cte_int)
                pushOperand((None if localctx._Cte_int is None else localctx._Cte_int.text), (None if localctx._factor_operator is None else self._input.getText(localctx._factor_operator.start,localctx._factor_operator.stop)), 'int', 1, 0)
                pass
            elif token in [31]:
                self.state = 264
                localctx._Cte_float = self.match(patitoParser.Cte_float)
                pushOperand((None if localctx._Cte_float is None else localctx._Cte_float.text), (None if localctx._factor_operator is None else self._input.getText(localctx._factor_operator.start,localctx._factor_operator.stop)), 'float', 1, 0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._Id = None # Token

        def Id(self):
            return self.getToken(patitoParser.Id, 0)

        def body(self):
            return self.getTypedRuleContext(patitoParser.BodyContext,0)


        def id_loop(self):
            return self.getTypedRuleContext(patitoParser.Id_loopContext,0)


        def vars_(self):
            return self.getTypedRuleContext(patitoParser.VarsContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunc" ):
                listener.enterFunc(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunc" ):
                listener.exitFunc(self)




    def func(self):

        localctx = patitoParser.FuncContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_func)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 268
            self.match(patitoParser.T__26)
            self.state = 269
            localctx._Id = self.match(patitoParser.Id)
            addFunction((None if localctx._Id is None else localctx._Id.text), 'local')
            self.state = 271
            self.match(patitoParser.T__13)
            self.state = 273
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==33:
                self.state = 272
                self.id_loop()


            self.state = 275
            self.match(patitoParser.T__14)
            self.state = 276
            self.match(patitoParser.T__27)
            self.state = 278
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 277
                self.vars_()


            quadStart((None if localctx._Id is None else localctx._Id.text))
            self.state = 281
            self.body()
            quadEnd((None if localctx._Id is None else localctx._Id.text))
            self.state = 283
            self.match(patitoParser.T__28)
            self.state = 284
            self.match(patitoParser.T__1)
            deleteVarTable((None if localctx._Id is None else localctx._Id.text))
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Id_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._Id = None # Token
            self._type = None # TypeContext

        def Id(self):
            return self.getToken(patitoParser.Id, 0)

        def type_(self):
            return self.getTypedRuleContext(patitoParser.TypeContext,0)


        def id_loop_prime(self):
            return self.getTypedRuleContext(patitoParser.Id_loop_primeContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_id_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterId_loop" ):
                listener.enterId_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitId_loop" ):
                listener.exitId_loop(self)




    def id_loop(self):

        localctx = patitoParser.Id_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_id_loop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 287
            localctx._Id = self.match(patitoParser.Id)
            self.state = 288
            self.match(patitoParser.T__5)
            self.state = 289
            localctx._type = self.type_()
            addVar((None if localctx._Id is None else localctx._Id.text), (None if localctx._type is None else self._input.getText(localctx._type.start,localctx._type.stop)))
            self.state = 291
            self.id_loop_prime()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Id_loop_primeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def id_loop(self):
            return self.getTypedRuleContext(patitoParser.Id_loopContext,0)


        def getRuleIndex(self):
            return patitoParser.RULE_id_loop_prime

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterId_loop_prime" ):
                listener.enterId_loop_prime(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitId_loop_prime" ):
                listener.exitId_loop_prime(self)




    def id_loop_prime(self):

        localctx = patitoParser.Id_loop_primeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_id_loop_prime)
        try:
            self.state = 296
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 293
                self.match(patitoParser.T__6)
                self.state = 294
                self.id_loop()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





