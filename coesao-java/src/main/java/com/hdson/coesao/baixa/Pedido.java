package com.hdson.coesao.baixa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Pedido {

    private String cliente;
    private List<ItemPedido> itens;
    private BigDecimal total;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.total = BigDecimal.ZERO;
    }

    public void adicionarItem(ItemPedido item){
        this.itens.add(item);
        this.calcularTotal();
    }

    public void removerItem(ItemPedido item) {
        this.itens.remove(item);
        this.calcularTotal();
    }

    public void calcularTotal(){
        this.total = BigDecimal.ZERO;
        for(ItemPedido item : this.itens) {
            this.total = this.total.add(item.getValorTotal());
        }
    }

    public void enviarEmailConfirmacao() {
        System.out.println("Enviando email para cliente : " + this.cliente);
    }


    public void imprimirPedido() {
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Itens:");
        for(ItemPedido item : this.itens){
            System.out.printf("- %s : %s x %s", item.getDescricao(), item.getQuantidade(), item.getPrecoUnitario());
        }
        System.out.println("Total: " + this.total);
    }
}
