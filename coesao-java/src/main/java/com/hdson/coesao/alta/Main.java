package com.hdson.coesao.alta;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido("Produto 1", 2, new BigDecimal("10.00")));
        pedido.adicionarItem(new ItemPedido("Produto 2", 1, new BigDecimal("20.00")));

        ProcessadorPedido processador = new ProcessadorPedido();
        processador.calcularTotal(pedido);
        processador.imprimirPedido(pedido);
        processador.enviarEmailConfirmacao(pedido);
    }
}
