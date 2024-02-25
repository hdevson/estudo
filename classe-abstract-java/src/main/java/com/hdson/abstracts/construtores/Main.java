package com.hdson.abstracts.construtores;

public class Main {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente("João", 5000.0, 1000.0);
        System.out.println("Informações do Gerente:");
        gerente.exibirInfo();

        Funcionario analista = new Analista("Maria", 3000.0);
        System.out.println("\nInformações do Analista:");
        analista.exibirInfo();
    }
}
