package com.hdson.abstracts.heranca;

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        System.out.println("Class: " + cachorro.getClass().getSimpleName());
        cachorro.showNome();
        cachorro.emitirSom();
        cachorro.mover();

        Animal gato = new Gato("Whiskers");
        System.out.println("Class: " + gato.getClass().getSimpleName());
        cachorro.showNome();
        gato.emitirSom();
        gato.mover();
    }

}
