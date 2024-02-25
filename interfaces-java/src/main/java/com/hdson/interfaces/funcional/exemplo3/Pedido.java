package com.hdson.interfaces.funcional.exemplo3;

public class Pedido {

    private double valorTotal;
    private Desconto desconto;

    public Pedido(double valorTotal, Desconto desconto){
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }

    public double getValorTotal(){
        return valorTotal;
    }

    public double getValorDesconto(){
        return desconto.calcularDesconto(valorTotal);
    }

    public double getValorFinal(){
        return valorTotal - getValorDesconto();
    }

}
