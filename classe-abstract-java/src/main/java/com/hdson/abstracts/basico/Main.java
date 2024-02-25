package com.hdson.abstracts.basico;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 50000.0);
        System.out.printf("[CARRO] Marca: %s | Modelo: %s | Custo: %s %n%n", carro.getMarca(), carro.getModelo(), carro.calcularCusto());

        Moto moto = new Moto("Honda", "CBR 1000", 1000, 30000.0);
        System.out.printf("[MOTO] Marca: %s | Modelo: %s | Custo: %s %n%n", moto.getMarca(), moto.getModelo(), moto.calcularCusto());
    }
}
