package com.ada.conta;

import com.ada.cliente.Cliente;

import java.time.LocalDateTime;
import java.util.List;

public class ContaCorrente implements Conta {
    private Cliente cliente;
    private LocalDateTime dataAtualizacao;
    private Identificador<String> numeroConta;
    private double saldo;
    private boolean status;
    private List<Transacao> transacaos;

    public ContaCorrente(String id ) {

        super();
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public Identificador<String> getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public List<Transacao> getTransacaos() {
        return transacaos;
    }

    public void transferir(double valor, Conta contaDestino) {

        if (this.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    @Override
    public Cliente getCliente() {
        return null;
    }

    @Override
    public String getNumero() {
        return "";
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    @Override
    public double depositar(double valor) {
        this.saldo += valor;
        return valor;
    }

    @Override
    public double consultarSaldo() {
        return 0;
    }

    @Override
    public void criarTransacao(Transacao transacao) {

    }

    public void ativarDesativar() {

        if (this.status) {
            this.status = false;
        } else {
            this.status = true;
        }
    }
}
