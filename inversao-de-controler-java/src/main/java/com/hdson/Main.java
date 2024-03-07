package com.hdson;

import com.hdson.service.Repositorio;
import com.hdson.service.Service;
import com.hdson.service.impl.RepositorioImpl;
import com.hdson.service.impl.ServiceImpl;

public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.register(Repositorio.class, new RepositorioImpl());
        container.register(Service.class, new ServiceImpl(container.resolver(Repositorio.class)));

        Cliente cliente = new Cliente(container.resolver(Service.class));
        cliente.executarServico();

    }
}
