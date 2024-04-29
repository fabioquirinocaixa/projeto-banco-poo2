package com.ada.cliente;

import java.time.LocalDate;

public class Cliente {

    private Classificacao classificacao;
    private Identificador identificador;
    private String nome;
    private LocalDate dataCadastro;
    private boolean status;


    public Cliente(Classificacao classificacao, Identificador identificador) {
        validar (classificacao, identificador);

        this.classificacao = classificacao;
        this.identificador = identificador;
        this.nome = nome;
        this.dataCadastro = LocalDate.now();
        this.status = true;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public Identificador getIdentificador() {
        return identificador;
    }
    public String getNome () {
        return nome;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public boolean isStatus() {
        return status;
    }

    public void alterarNome(String novoNome) {
        if (novoNome == null || novoNome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do Cliente não pode ser nulo ou vazio");
        }
        this.nome = novoNome;
    }

    public void ativarDesativar() {

        if (this.status) {
            this.status = false;
        } else {
            this.status = true;
        }
    }
    private void validar(Classificacao classificacao,Identificador identificador) {
        if (identificador == null || identificador.equals("")){
            throw new IllegalArgumentException("O ID do Cliente não pode ser nulo ou vazio");
        }
        if (classificacao == null){
            throw new IllegalArgumentException("O Tipo de Cliente não pode ser nulo");
        }
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do Cliente não pode ser nulo ou vazio");
        }
    }


}
