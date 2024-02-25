package com.hdson.enuns;

public enum StatusEnum {
    ACTIVE("Ativo"),
    INACTIVE("Inativo"),
    PENDING("Pendente");

    private final String text;
    StatusEnum(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }


}
