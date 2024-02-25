package com.hdson.abstracts.polimorfismo;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Cachorro("Rex");
        Animal animal2 = new Gato("Whiskers");

        animal1.emitirSom(); // Saída: O cachorro está latindo.
        animal2.emitirSom(); // Saída: O gato está miando.

        animal1.mover(); // Saída: O animal está se movendo. (herdado da superclasse)
        animal2.mover(); // Saída: O animal está se movendo. (herdado da superclasse)
    }
}
