package com.hdson.interfaces.metodopadrao.exemplo1;

public class Main {

    public static void main(String[] args) {
        Calculadora minhaCalculadora = new MinhaCalculadora();
        System.out.printf("Somar: %s%n", minhaCalculadora.somar(1,2));
        System.out.printf("Multiplicar: %s%n", minhaCalculadora.multiplicar(1,2));
        System.out.printf("Subtrair: %s%n", minhaCalculadora.subtrair(1,2));
    }
}
