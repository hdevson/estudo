package com.hdson.abstracts.construtores;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }


    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }


}
