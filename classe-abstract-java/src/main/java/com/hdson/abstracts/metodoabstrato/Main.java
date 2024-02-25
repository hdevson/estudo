package com.hdson.abstracts.metodoabstrato;

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        System.out.println("Class " + cachorro.getClass().getSimpleName());
        cachorro.emitirSom();
        System.out.println("\n");

        Animal gato = new Gato();
        System.out.println("Class " + gato.getClass().getSimpleName());
        gato.emitirSom();
    }
}
