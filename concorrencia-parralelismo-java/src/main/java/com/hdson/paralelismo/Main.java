package com.hdson.paralelismo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    /**
     * Paralelismo:
     * Paralelismo refere-se à capacidade de executar várias
     * tarefas de forma real simultânea, aproveitando os recursos
     * de hardware que suportam múltiplos threads de execução.
     * É útil quando você precisa lidar com tarefas intensivas
     * que podem ser divididas em partes menores e executadas
     * ao mesmo tempo.
     *
     * ----
     * Paralelismo: Use quando você tem tarefas que podem ser
     * divididas em partes menores e executadas ao mesmo tempo,
     * aproveitando os recursos de hardware disponíveis.
     */

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.submit(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.submit(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println("Thread 3: " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.shutdown();
    }

}
