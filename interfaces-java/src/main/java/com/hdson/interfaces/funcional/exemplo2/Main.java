package com.hdson.interfaces.funcional.exemplo2;

public class Main {

    public static void main(String[] args) {
        Verificador par = numero -> ((numero % 2) == 0);
        System.out.println("É par: " + par.verificar(10));

        Verificador impar = numero -> ((numero % 2) != 0);
        System.out.println("É Impar: " + impar.verificar(11));

        Verificador positivo = numero -> numero > 0;
        System.out.println("É positivo: " + positivo.verificar(-5));
        System.out.println("É positivo: " + positivo.verificar(10));
    }
}
