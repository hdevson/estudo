package com.hdson.coesao.alta;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;

    public Pedido(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        this.itens.add(item);
    }

    public void removerItem(ItemPedido item){
        this.itens.remove(item);
    }

    public List<ItemPedido> getItens(){
        return this.itens;
    }

}
