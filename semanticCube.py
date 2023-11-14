
semanticCube = {
    'int': {
        'int': {
            '+': 'int',
            '-': 'int',
            '*': 'int',
            '/': 'float',
            '<': 'bool',
            '>': 'bool',
            '!=': 'bool',
            '=': 'int',
        },
        'float': {
            '+': 'float',
            '-': 'float',
            '*': 'float',
            '/': 'float',
            '<': 'bool',
            '>': 'bool',
            '!=': 'bool',
            '=': 'ERROR', #lo dejo?
        },
    },
    'float': {
        'int': {
            '+': 'float',
            '-': 'float',
            '*': 'float',
            '/': 'float',
            '<': 'bool',
            '>': 'bool',
            '!=': 'bool',
            '=': 'float',
        },
        'float': {
            '+': 'float',
            '-': 'float',
            '*': 'float',
            '/': 'float',
            '<': 'bool',
            '>': 'bool',
            '!=': 'bool',
            '=': 'float',
        },
    },
}