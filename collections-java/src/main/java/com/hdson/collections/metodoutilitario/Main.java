package com.hdson.collections.metodoutilitario;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    private static final String TITULO = "%n======%n== %s %n======%n";
    public static void main(String[] args) {
        ordenacao();
        embaralhamento();
        ordenacaoArray();
        sublista();
        ordenacaoPersonalizada();
    }

    public static void ordenacao(){
        System.out.printf(TITULO, "ORDENACAO");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        // antes de ordenar
        System.out.println(numeros);
        // ordenando
        Collections.sort(numeros);
        // dps de ordenar
        System.out.println(numeros);
    }


    public static void embaralhamento(){
        System.out.printf(TITULO, "EMBARALHAMENTO");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        // antes de embaralhar
        System.out.println(numeros);
        // embaralhando
        Collections.shuffle(numeros);
        // dps de embaralhar
        System.out.println(numeros);
    }

    public static void ordenacaoArray(){
        System.out.printf(TITULO, "ORDENACAO ARRAY");
        int[] numeros = {5, 2, 8, 1};
        // antes de ordenar
        System.out.println("antes de ordenar");
        Arrays.stream(numeros).forEach(numero -> System.out.println(numero + " "));
        // embaralhando
        Arrays.sort(numeros);
        // dps de ordenadar
        System.out.println("dps de ordenar");
        Arrays.stream(numeros).forEach(numero -> System.out.println(numero + " "));

    }

    public static void sublista(){
        System.out.printf(TITULO, "SUBLISTA");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println(numeros);

        // Cria uma sublista da lista original
        List<Integer> subLista = numeros.subList(1, 4);
        System.out.println(subLista);  // Saída: [2, 3, 4]
    }


    public static void ordenacaoPersonalizada(){
        System.out.printf(TITULO, "ORDENACAO PERSONALIZADA");
        List<String> palavras = new ArrayList<>();
        palavras.add("banana");
        palavras.add("abacaxi");
        palavras.add("uva");

        // antes de ordenar
        System.out.println(palavras);
        // ordenacao personalizada pelo tamanho da palavra
        Collections.sort(palavras, Comparator.comparing(String::length));
        // dps de ordenar
        System.out.println(palavras);
    }


}
