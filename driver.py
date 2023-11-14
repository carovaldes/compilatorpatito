from antlr4 import *
from patitoLexer import patitoLexer
from patitoParser import patitoParser
from customPatitoListener import customPatitoListener

def main():
    # lexer
    input_stream = FileStream("fibo.txt")
    lexer = patitoLexer(input_stream)
    token_stream = CommonTokenStream(lexer)

    # parser
    parser = patitoParser(token_stream)
    tree = parser.start() 

    # traverse the parse tree
    listener = customPatitoListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

# Run
if __name__ == '__main__':
    main()
