package com.hdson;

import com.hdson.service.Notificar;

public class Cliente {

    private Notificar notificar;

    public Cliente(Notificar notificar){
        this.notificar = notificar;
    }

    public void realizarPedido(){
        System.out.println("Realizando pedido");
        notificar.enviarMensagem("Pedido realizado com sucesso");
    }
}
