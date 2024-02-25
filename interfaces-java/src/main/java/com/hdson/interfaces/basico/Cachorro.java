package com.hdson.interfaces.basico;

public class Cachorro implements Animal {
    @Override
    public String fazerBarulho() {
        return "au au";
    }

    @Override
    public String comer() {
        return "comer ração";
    }
}
