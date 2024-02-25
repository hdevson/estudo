package com.hdson.enuns;

public enum SemanaEnum {

    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);



    private final int index;

    SemanaEnum(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static SemanaEnum getIndexByNumber(int index){
        for(var dia : SemanaEnum.values()){
            if(dia.getIndex() == index)
                return dia;
        }
        throw new UnsupportedOperationException("Valor index fora do esperado");
    }
}
