package com.hdson.interfaces.metodopadrao.exemplo2;

public interface Animal {
    void emitirSom();

    default void exibirInformacao(){
        System.out.println("Este animal faz som: ");
        emitirSom();
    }
}
