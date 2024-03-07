package com.hdson.coesao.alta;

import java.math.BigDecimal;

public class ItemPedido {

    private String descricao;
    private int quantidade;
    private BigDecimal precoUnitario;

    public ItemPedido(String descricao, int quantidade, BigDecimal precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {return descricao;}

    public int getQuantidade() {return quantidade;}

    public BigDecimal getPrecoUnitario() {return precoUnitario;}

    public BigDecimal getValorTotal() {
        return precoUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

}
