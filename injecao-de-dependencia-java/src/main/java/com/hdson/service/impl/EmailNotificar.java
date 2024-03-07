package com.hdson.service.impl;

import com.hdson.service.Notificar;

public class EmailNotificar implements Notificar {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando notificacao => "  + mensagem);
        // Implementação para enviar um e-mail
    }
}
