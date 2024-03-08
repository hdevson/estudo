package com.hdson.acoplamento.alto;

public class Main {

    /*
        Neste exemplo, a classe Calculadora possui métodos para realizar
        operações matemáticas simples, como soma, subtração, multiplicação e divisão.
        No entanto, ela está fortemente acoplada às operações e aos operandos, o
        que pode tornar difícil a modificação ou extensão do código.
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 5);
        System.out.println("Somar: " + calculadora.somar());
        System.out.println("Subtracao: " + calculadora.subtrair());
        System.out.println("Multiplicacao: " + calculadora.multiplicar());
        System.out.println("Divisao: " + calculadora.dividir());
    }
}
