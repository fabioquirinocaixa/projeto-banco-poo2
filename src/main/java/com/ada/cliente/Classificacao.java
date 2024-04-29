package com.ada.cliente;

public enum Classificacao {


    PJ("PJ", "CNPJ", 14),
    PF("PF", "CPF", 11);

    private String sigla;
    private String tipoDocumento;
    private int tamanhoDocumento;

    Classificacao(String sigla, String tipoDocumento, int tamanhoDocumento) {
        this.sigla = sigla;
        this.tipoDocumento = tipoDocumento;
        this.tamanhoDocumento = tamanhoDocumento;

    }

    private static void valueOf() {
        Classificacao.valueOf();
        Classificacao.values();
    }

    public boolean validarDocumento(Classificacao tipo, String documento) {
        if (tipo.tamanhoDocumento == documento.length()) {
            return true;
        }
        return false;
    }
}
