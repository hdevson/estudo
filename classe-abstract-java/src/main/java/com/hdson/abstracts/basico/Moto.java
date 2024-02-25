package com.hdson.abstracts.basico;

public class Moto extends Veiculo {
    private double cilindrada;
    private double preco;

    public Moto(String marca, String modelo, double cilindrada, double preco) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
        this.preco = preco;
    }

    @Override
    public double calcularCusto() {
        return preco * 1.1; // Preço da moto com 10%
    }
}
