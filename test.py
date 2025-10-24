from flask import Flask, render_template, request
from antlr4 import *
from MiniLangLexer import MiniLangLexer
from MiniLangParser import MiniLangParser
from MiniLangvisitoropcional import MiniLangVisitorImpl

app = Flask(__name__)

def evaluate_expression(input_expr):
    input_stream = InputStream(input_expr)
    lexer = MiniLangLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = MiniLangParser(token_stream)
    tree = parser.expr()
    visitor = MiniLangVisitorImpl()
    return visitor.visit(tree)

@app.route('/', methods=['GET'])
def index():
    return render_template('index.html')

@app.route('/calcular', methods=['POST'])
def calcular():
    x = int(request.form['x'])
    y = int(request.form['y'])
    z = (x * y) + 10
    x_incrementado = x + 1
    return render_template('index.html', resultado={'z': z, 'x': x_incrementado})

if __name__ == '__main__':
    app.run(debug=True)
