package com.hdson;

import com.hdson.service.Notificar;
import com.hdson.service.impl.EmailNotificar;

public class Main {

    public static void main(String[] args) {
        Notificar notificar = new EmailNotificar();
        Cliente cliente = new Cliente(notificar);
        cliente.realizarPedido();
    }
}
