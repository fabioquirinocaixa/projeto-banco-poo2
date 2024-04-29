package com.ada.cliente;

public class CNPJ implements Identificador<String> {

    private String valor;

    public CNPJ(String valor) {
        this.valor = valor;
        this.validar();
    }



    public String getValor() {
        return valor;
    }


    public void validar() {
        if (valor == null || valor.length() != 14) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
    }
}
