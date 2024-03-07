package com.hdson.s.antes;

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
        return  totalCompras * 0.1; // Exemplo simples com desconto de 10%
    }

    public void enviarEmailPromocao(){
        System.out.println("Email promocao enviado para " + this.nome);
    }
}
