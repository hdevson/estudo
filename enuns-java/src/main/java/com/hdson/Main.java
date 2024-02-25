package com.hdson;

import com.hdson.enuns.*;

import java.util.Arrays;

public class Main {
    private final static String SEPARAR = "############";
    private final static String TITULO = "%n=========%n %s %n=========%n";
    public static void main(String[] args) {
        diaSemana();
        operacaoMatematica();
        pizzaStatus();
        status();
        mes();
    }


    private static void  diaSemana(){
        System.out.printf(TITULO, "DIA SEMANA");
        Arrays.stream(SemanaEnum.values()).forEach(dia -> {
            System.out.printf("Name: %s%n", dia.name());
            System.out.printf("Index: %s%n", dia.getIndex());
            System.out.println(SEPARAR);
        });
        System.out.printf("Name: %s%n", SemanaEnum.getIndexByNumber(3).name());
        System.out.printf("Index: %s%n", SemanaEnum.getIndexByNumber(3).getIndex());
        System.out.println(SEPARAR);
        try {
            SemanaEnum.getIndexByNumber(10);
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
            System.out.println(SEPARAR);
        }
    }


    private static void operacaoMatematica(){
        System.out.printf(TITULO, "OOPERACAO MATEMATICA");
        Arrays.stream(OperacaoMatematicaEnum.values()).forEach(ope -> {
            System.out.printf("Enum: %s%n", ope.name());
            System.out.printf("DigaOla: %s%n", ope.digaOla());
            System.out.printf("Operacao: %s -> Result: %s%n", ope.name(), ope.execute(1, 10));
            System.out.println(SEPARAR);
        });

    }


    private static void pizzaStatus(){
        System.out.printf(TITULO, "PIZZA STATUS");
        Arrays.stream(PizzaStatusEnum.values()).forEach(status -> {
            System.out.printf("Enum: %s%n", status.name());
            System.out.printf("Time: %s%n", status.getTimeToDelivery());
            System.out.printf("isReady: %s%n", status.isReady());
            System.out.printf("Ordered: %s%n", status.isOrdered());
            System.out.printf("Delivered: %s%n", status.isDelivered());
            System.out.println(SEPARAR);
        });
    }


    private static void status(){
        System.out.printf(TITULO, "STATUS");
        Arrays.stream(StatusEnum.values()).forEach(status -> {
            System.out.printf("Enum: %s%n", status.name());
            System.out.printf("Text: %s%n", status.getText());
            System.out.println(SEPARAR);
        });
    }


    private static void mes(){
        System.out.printf(TITULO, "MES");
        Arrays.stream(MesEnum.values()).forEach(mes -> {
            System.out.printf("Enum: %s%n", mes.name());
            System.out.printf("Nome: %s%n", mes.getNome());
            System.out.printf("Numero: %s%n", mes.getNumero());
            System.out.printf("Dias: %s%n", mes.getDias());
            System.out.println(SEPARAR);
        });
        System.out.printf(TITULO, "MES FEVEREIRO BISSEXTO - ANO 2004");
        System.out.printf("Enum: %s%n", MesEnum.FEVEREIRO.name());
        System.out.printf("Nome: %s%n", MesEnum.FEVEREIRO.getNome());
        System.out.printf("Dias: %s%n", MesEnum.getDiasDoMes(MesEnum.FEVEREIRO, 2004));
        System.out.println(SEPARAR);
    }

}
