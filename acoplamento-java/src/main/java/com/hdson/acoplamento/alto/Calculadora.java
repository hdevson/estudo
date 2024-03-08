package com.hdson.acoplamento.alto;

public class Calculadora {
    private int operador1;
    private int operador2;

    public Calculadora(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public int somar(){
        return operador1 + operador2;
    }

    public int subtrair() {
        return operador1 - operador2;
    }

    public int multiplicar() {
        return operador1 * operador2;
    }

    public int dividir(){
        return operador1 / operador2;
    }
}
