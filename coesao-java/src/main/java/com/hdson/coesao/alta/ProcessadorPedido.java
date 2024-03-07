package com.hdson.coesao.alta;

import java.math.BigDecimal;

public class ProcessadorPedido {

    public void calcularTotal(Pedido pedido) {
        BigDecimal total = BigDecimal.ZERO;
        for (ItemPedido item : pedido.getItens()) {
            total = total.add(item.getValorTotal());
        }
        System.out.println("Total: " + total);
    }

    public void enviarEmailConfirmacao(Pedido pedido) {
        System.out.println("Enviando Email");
    }

    public void imprimirPedido(Pedido pedido) {
        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item.getDescricao());
        }
    }

}
