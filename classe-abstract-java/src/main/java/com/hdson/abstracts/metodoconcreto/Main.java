package com.hdson.abstracts.metodoconcreto;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000.0);
        conta.exibirSaldo(); // Exibe o saldo inicial

        conta.depositar(500.0); // Deposita dinheiro
        conta.exibirSaldo(); // Exibe o novo saldo

        conta.sacar(200.0); // Saca dinheiro
        conta.exibirSaldo(); // Exibe o novo saldo
    }
}
