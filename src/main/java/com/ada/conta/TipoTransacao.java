package com.ada.conta;

public enum TipoTransacao {
    
    SAQUE, DEPOSITO, TRANSFERENCIA, INVESTIMENTO;

    TipoTransacao() {

    }

    private static void valueOf() {
        TipoTransacao.valueOf();
        TipoTransacao.values();
    }

}
