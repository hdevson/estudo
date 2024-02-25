package com.hdson.abstracts.metodoconcreto;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()){
            System.out.println("Sacando " + valor + " da conta corrente");
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando " + valor + " na conta corrente");
        setSaldo(getSaldo() + valor);
    }

    private double getSaldo() {
        return super.saldo;
    }

    private void setSaldo(double saldo) {
        super.saldo = saldo;
    }
}

