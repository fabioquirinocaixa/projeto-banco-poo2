package com.ada.conta;

public class NumeroConta implements Identificador{
    String numero;

    public NumeroConta(String numero) {
        this.numero = numero;
    }

    @Override
    public Object getID() {
        return null;
    }

    @Override
    public void validar() {

    }
}
