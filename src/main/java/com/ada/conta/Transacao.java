package com.ada.conta;

import com.ada.cliente.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transacao {

    private TipoTransacao tipoTransacao;
    private LocalDateTime dataTransacao;
    private double valor;
    private String observacao;
    private Cliente destinatario;
    private Cliente remetente;

    public Transacao(TipoTransacao tipoTransacao, double valor){
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataTransacao = LocalDateTime.now();
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }

    public double getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public Cliente getRemetente() {
        return remetente;
    }

    public void setRemetente(Cliente remetente) {
        this.remetente = remetente;
    }

}
