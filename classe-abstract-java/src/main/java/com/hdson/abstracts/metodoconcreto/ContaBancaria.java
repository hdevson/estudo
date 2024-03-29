package com.hdson.abstracts.metodoconcreto;

abstract class ContaBancaria {

    protected double saldo;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
