package com.hdson.interfaces.metodopadrao.exemplo1;

public interface Calculadora {

    default int somar(int a, int b){
        return a + b;
    }

    default int subtrair(int a, int b){
        return a - b;
    }

    int multiplicar(int a, int b);
}
