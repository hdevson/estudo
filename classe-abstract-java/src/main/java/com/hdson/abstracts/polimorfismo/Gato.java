package com.hdson.abstracts.polimorfismo;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " O gato está miando.");
    }
}
