package com.hdson.enuns;

public enum OperacaoMatematicaEnum {

    SOMA {
        @Override
        public int execute(int a, int b) {
            return a + b;
        }

        @Override
        public String digaOla() {
            return "Método implementado";
        }
    },

    SUBTRACAO {
        @Override
        public int execute(int a, int b) {
            return a - b;
        }
    },

    MULTIPLICACAO {
        @Override
        public int execute(int a, int b) {
            return a * b;
        }
    },

    DIVISAO {
        @Override
        public int execute(int a, int b) {
            return a / b;
        }
    };


    public abstract int execute(int a, int b);

    public String digaOla() {
        return "Valor padrao";
    }

}
