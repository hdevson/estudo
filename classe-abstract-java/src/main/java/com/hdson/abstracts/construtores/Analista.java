package com.hdson.abstracts.construtores;

public class Analista extends Funcionario {

    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalario();
    }


}
