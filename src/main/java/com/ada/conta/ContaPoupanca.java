package com.ada.conta;

import com.ada.cliente.Cliente;

import java.time.LocalDateTime;
import java.util.List;

public class ContaPoupanca implements Conta {
    private Cliente cliente;
    private LocalDateTime dataAtualizacao;
    private Identificador<String> numeroConta;
    private double saldo;
    private boolean status;
    private List<Transacao> transacaos;

    public ContaPoupanca(String id) {
        super();
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String getNumero() {
        return "";
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

    public ContaPoupanca(Cliente cliente, Identificador<String> numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
    }

    public void ativarDesativar() {

        if (this.status) {
            this.status = false;
        } else {
            this.status = true;
        }

    }
    public void transferir(double valor, Conta contaDestino) {

        if (this.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
    }
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    @Override
    public double depositar(double valor) {
        this.saldo += valor;
        return valor;

    }

    public double consultarSaldo() {
        return 0;
    }

    public void criarTransacao(Transacao transacao) {

    }
}
