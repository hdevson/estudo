package com.hdson.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> filaEmergencia = new PriorityQueue<>();
        Queue<String> filaConsulta = new LinkedList<>();

        filaEmergencia.add("GRAVE - Paciente 1");
        filaEmergencia.add("GRAVE - Paciente 2");
        filaConsulta.add("CONSULTA - Paciente 3");
        filaConsulta.add("CONSULTA - Paciente 4");

        System.out.println("[EMERGENCIA] Atendimento");
        while (!filaEmergencia.isEmpty()){
            String paciente = filaEmergencia.poll();
            System.out.println("[EMERGENCIA] Atendendo paciente: " + paciente);
            String proximoPaciente = filaEmergencia.peek();
            if(proximoPaciente != null)
                System.out.println("[EMERGENCIA] Proximo paciente: " + proximoPaciente);
        }

        System.out.println("[CONSULTA] Atendimento");
        while (!filaConsulta.isEmpty()){
            String paciente = filaConsulta.poll();
            System.out.println("[CONSULTA] Atendendo paciente: " + paciente);
            String proximoPaciente = filaConsulta.peek();
            if(proximoPaciente != null)
                System.out.println("[CONSULTA] Proximo paciente: " + proximoPaciente);
        }


    }
}
