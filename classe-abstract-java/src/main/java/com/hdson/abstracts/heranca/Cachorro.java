package com.hdson.abstracts.heranca;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}
