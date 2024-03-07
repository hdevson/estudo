package com.hdson.coesao.baixa;

import java.math.BigDecimal;

public class Main {

    /**
     * Neste exemplo, a classe Pedido possui métodos para adicionar e remover itens do pedido,
     * calcular o total do pedido e imprimir as informações do pedido. No entanto, esses métodos
     * estão lidando com diferentes aspectos do pedido (manipulação de itens, cálculo do total,
     * impressão do pedido), o que torna a classe menos coesa.
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido("hdson");
        pedido.adicionarItem(new ItemPedido("prod 1", 2,  new BigDecimal("10.00")));
        pedido.adicionarItem(new ItemPedido("prod 2", 1,  new BigDecimal("20.00")));
        pedido.calcularTotal();
        pedido.imprimirPedido();
        pedido.enviarEmailConfirmacao();
    }
}
