package com.hdson.interfaces.funcional.exemplo3;

public class Main {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100, valor -> valor * 0.1);             // Desconto 10%
        Pedido pedido2 = new Pedido(200, valor -> valor - (valor - 50.0));  // Desconto fixo de 50
        Pedido pedido3 = new Pedido(150, valor -> 0);                       // Sem Desconto fixo de 50

        System.out.println("Pedido 1:");
        System.out.println("Valor total: R$" + pedido1.getValorTotal());
        System.out.println("Valor desconto: R$" + pedido1.getValorDesconto());
        System.out.println("Valor final: R$" + pedido1.getValorFinal());

        System.out.println("\nPedido 2:");
        System.out.println("Valor total: R$" + pedido2.getValorTotal());
        System.out.println("Valor desconto: R$" + pedido2.getValorDesconto());
        System.out.println("Valor final: R$" + pedido2.getValorFinal());

        System.out.println("\nPedido 3:");
        System.out.println("Valor total: R$" + pedido3.getValorTotal());
        System.out.println("Valor desconto: R$" + pedido3.getValorDesconto());
        System.out.println("Valor final: R$" + pedido3.getValorFinal());

    }
}
