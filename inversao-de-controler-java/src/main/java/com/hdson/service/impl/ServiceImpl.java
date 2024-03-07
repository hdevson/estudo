package com.hdson.service.impl;

import com.hdson.service.Repositorio;
import com.hdson.service.Service;

public class ServiceImpl implements Service {

    private final Repositorio repositorio;

    public ServiceImpl(Repositorio repositorio){
        this.repositorio = repositorio;
    }
    @Override
    public void executar() {
        System.out.println("Executando o servico...");
        repositorio.salvar("Executando o servico...");
    }
}
