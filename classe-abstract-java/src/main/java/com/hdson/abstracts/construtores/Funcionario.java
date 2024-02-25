package com.hdson.abstracts.construtores;

abstract class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Total: " + calcularSalario());
    }

    public Double getSalario(){
        return salarioBase;
    }
}
