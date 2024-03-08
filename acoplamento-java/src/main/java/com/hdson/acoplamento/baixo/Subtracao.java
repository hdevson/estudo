package com.hdson.acoplamento.baixo;

public class Subtracao implements Operador {

    @Override
    public int executar(int operador1, int operador2) {
        return operador1 - operador2;
    }
}
