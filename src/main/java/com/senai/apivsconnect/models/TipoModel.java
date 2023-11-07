package com.senai.apivsconnect.models;

public enum TipoModel {
    ADMIN("admin"),
    DESEVOLVEDOR("dev"),
    CLIENTE("cliente");

    private String tipo;

    TipoModel(String tipo){
        this.tipo = tipo;

    }

    public String getRole(){
        return tipo;
    }
}
