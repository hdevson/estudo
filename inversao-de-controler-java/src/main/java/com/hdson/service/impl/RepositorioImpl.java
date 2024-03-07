package com.hdson.service.impl;

import com.hdson.service.Repositorio;

public class RepositorioImpl implements Repositorio {
    @Override
    public void salvar(String mensagem) {
        System.out.println("salvando mensagem :" + mensagem);
    }
}
