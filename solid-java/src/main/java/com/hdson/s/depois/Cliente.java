package com.hdson.s.depois;

public class Cliente {

    private String nome;
    private String endereco;
    private double totalCompras;


    public Cliente(String nome, String endereco, double totalCompras){
        this.nome = nome;
        this.endereco = endereco;
        this.totalCompras = totalCompras;
    }

    public double calcularDesconto(){
        return totalCompras * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
}
