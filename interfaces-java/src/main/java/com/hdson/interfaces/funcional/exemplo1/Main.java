package com.hdson.interfaces.funcional.exemplo1;

public class Main {

    public static void main(String[] args) {
        Calculadora cal = (a, b) -> a + b;
        System.out.println("Soma: " + cal.calcular(1,10));
    }
}
