package com.hdson.interfaces.basico;

public class CachorroDomestico implements AnimalDomestico {


    @Override
    public String brincar() {
        return "Brincando com a bola";
    }

    @Override
    public String fazerBarulho() {
        return "Au au Domestico";
    }

    @Override
    public String comer() {
        return "Comer ração Domestico";
    }

}
