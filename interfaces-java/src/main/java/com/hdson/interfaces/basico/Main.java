package com.hdson.interfaces.basico;

public class Main {

    private static final String TITULO = "%n%n========%n %s %n========%n";

    public static void main(String[] args) {
        cachorro();
        cachorroDomestico();
    }

    private static void cachorro(){
        Cachorro cachorro = new Cachorro();
        System.out.printf(TITULO, cachorro.getClass().getSimpleName());
        System.out.printf("fazerBarulho: %s%n", cachorro.fazerBarulho());
        System.out.printf("comer: %s%n", cachorro.comer());
    }

    private static void cachorroDomestico(){
        CachorroDomestico cachorroDomestico = new CachorroDomestico();
        System.out.printf(TITULO, cachorroDomestico.getClass().getSimpleName());
        System.out.printf("fazerBarulho: %s%n", cachorroDomestico.fazerBarulho());
        System.out.printf("comer: %s%n", cachorroDomestico.comer());
        System.out.printf("brincar: %s%n", cachorroDomestico.brincar());
    }
}