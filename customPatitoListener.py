from patitoListener import patitoListener

class customPatitoListener(patitoListener):
    def enterEveryRule(self, ctx):
        print("Enter:", type(ctx).__name__)

    def exitEveryRule(self, ctx):
        print("Exit:", type(ctx).__name__)