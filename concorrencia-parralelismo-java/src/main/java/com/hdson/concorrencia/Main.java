package com.hdson.concorrencia;

public class Main {
    /**
     * Concorrência:
     * Concorrência refere-se à capacidade de várias partes do seu
     * programa serem executadas em uma ordem não determinística,
     * o que pode resultar em tarefas sendo executadas "ao mesmo tempo",
     * mas não necessariamente de forma simultânea. É útil quando você
     * precisa lidar com várias tarefas de forma eficiente, como em
     * aplicações web que precisam responder a várias solicitações s
     * imultaneamente.
     *
     * ----
     * Concorrência: Use quando você precisa lidar com várias tarefas
     * que podem ser executadas de forma independente e
     * não exigem necessariamente a execução simultânea.
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for(int i = 0 ; i < 10; i++){
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0 ; i < 10; i++){
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
