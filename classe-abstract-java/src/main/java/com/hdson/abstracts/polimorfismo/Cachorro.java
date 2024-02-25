package com.hdson.abstracts.polimorfismo;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println( getNome() + " O cachorro está latindo.");
    }

}
