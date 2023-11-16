grammar patito;

@parser::header {
from symbolTable import *
from virtualMachine import *
}

start : programa EOF;

//regex
Cte_int : [0-9]+;
Cte_float : [0-9]+'.'[0-9]+;
Cte_string : '"' ~["]* '"';
Id : [a-zA-Z][a-zA-Z0-9]*;

//programa
programa : {pushMain()} 'program' Id {addFunction($Id.text, 'global')} ';' vars? func* 'main' {quadruploMain()} body {imprime()} 'end' {runVm()} {deleteAll()};

//vars
vars : 'var' list_var+;
list_var : list_id ':' type ';' {addVar($list_id.text, $type.text)};
list_id : Id (',' list_id)?;

//type
type : 'int' | 'float';

//body
body : '{' statement_loop '}';
statement_loop : statement statement_loop | ;

//statement
statement : assign | condition | cycle | f_call | print;

//assign
assign : Id {pushOperand($Id.text, '', '', 0, 0)} '=' {pushOperator('=')} expresion {cuadruploAssign()} ';';

//condition
condition : 'if' '(' expresion ')' {ifElse1()} body else ';' {ifElse2()};
else : 'else' {ifElse3()} body | ;

//cycle
cycle : 'while' {pushCont()} body 'do' '(' expresion {returnWhile()} ')' ';';

//f_call
f_call : Id '(' exp_loop ')'';';
exp_loop : expresion exp_loop_helper | ;
exp_loop_helper :','expresion exp_loop_helper | ;

//print
print : 'print' '(' print_loop ')' ';';
print_loop : print_args {cuadruploPrint()} (',' print_loop)?;
print_args : expresion | Cte_string {pushOperand($Cte_string.text, '','string', 1, 0)};

//expresion
expresion : exp expresion_helper;
expresion_helper : expresion_operator {pushOperator($expresion_operator.text)} exp {cuadruploExpresion()} | ;
expresion_operator : '>' | '<' | '!=';

//exp
exp : termino {cuadruploTermino('+', '-')} exp_helper;
exp_helper : exp_operator {pushOperator($exp_operator.text)} exp | ;
exp_operator:'+'|'-';

//termino
termino : factor {cuadruploTermino('*', '/')} termino_helper;
termino_helper : termino_operator {pushOperator($termino_operator.text)}  termino | ;
termino_operator : '*'| '/';

//factor
factor : '(' {pushOperator('(')} expresion ')' {popOperator()} | factor_arg;
factor_operator:'+'|'-';
factor_arg : (factor_operator? Id {pushOperand($Id.text, $factor_operator.text, '', 0, 0)}) | cte;

//cte
cte : factor_operator? (Cte_int {pushOperand($Cte_int.text, $factor_operator.text, 'int', 1, 0)} | Cte_float {pushOperand($Cte_float.text, $factor_operator.text, 'float', 1, 0)});

//func
func : 'void' Id {addFunction($Id.text, 'local')} '(' id_loop? ')' '[' vars? {quadStart($Id.text)} body {quadEnd($Id.text)} ']' ';' {deleteVarTable($Id.text)};
id_loop : Id ':' type {addVar($Id.text, $type.text)} id_loop_prime;
id_loop_prime : ',' id_loop | ;

WS : [ \t\r\n]+ -> skip;