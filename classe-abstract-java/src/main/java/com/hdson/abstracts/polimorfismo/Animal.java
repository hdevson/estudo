package com.hdson.abstracts.polimorfismo;

abstract class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom(); // Método abstrato que deve ser implementado pelas subclasses

    public void mover() {
        System.out.println(this.nome + " O animal está se movendo.");
    }

    protected String getNome(){
        return this.nome;
    }
}
