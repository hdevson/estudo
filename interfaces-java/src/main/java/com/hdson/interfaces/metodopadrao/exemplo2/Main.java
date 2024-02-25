package com.hdson.interfaces.metodopadrao.exemplo2;

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        System.out.println("class " + cachorro.getClass().getSimpleName());
        cachorro.exibirInformacao();
        System.out.print("\n");
        Animal gato = new Gato();
        System.out.println("class " + gato.getClass().getSimpleName());
        cachorro.exibirInformacao();
    }
}
