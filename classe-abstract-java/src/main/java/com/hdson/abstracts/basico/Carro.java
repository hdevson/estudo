package com.hdson.abstracts.basico;

public class Carro extends Veiculo {
    private int anoFabricacao;
    private double preco;

    public Carro(String marca, String modelo, int anoFabricacao, double preco){
        super(marca, modelo);
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }


    @Override
    public double calcularCusto() {
        return this.preco * 1.2; // Preço do carro com 20%
    }


}
