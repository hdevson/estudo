package com.hdson.abstracts.heranca;

abstract class Animal {

    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void mover(){
        System.out.println("O animal esta se movendo");
    }

    protected void showNome(){
        System.out.println(this.nome);
    }

}
