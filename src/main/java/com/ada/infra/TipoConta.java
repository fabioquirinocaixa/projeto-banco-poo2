package com.ada.infra;

public enum TipoConta {

    CORRENTE, POUPOANCA, INVESTIMENTO;

    TipoConta() {
        TipoConta.valueOf();
        TipoConta.values();
    }

    private static void valueOf() {
    }
}
