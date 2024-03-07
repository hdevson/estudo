package com.hdson.s.depois;

public class EmailService {

    public void enviarEmailPromocao(Cliente cliente){
        System.out.println("Email prommocao enviado para " + cliente.getNome());
    }
}
