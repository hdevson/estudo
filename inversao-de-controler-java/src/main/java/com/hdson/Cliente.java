package com.hdson;

import com.hdson.service.Service;

public class Cliente {

    private final Service service;

    public Cliente(Service service) {
        this.service = service;
    }

    public void executarServico(){
        service.executar();
    }
}
