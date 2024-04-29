package com.ada.conta;

import com.ada.cliente.Cliente;

import java.time.LocalDateTime;
import java.util.List;

public class ContaInvestimento implements Conta{
    public ContaInvestimento(String id) {

        super();
    }

    private Cliente cliente;
    private LocalDateTime dataAtualizacao;
    private Identificador<String> numeroConta;
    private double saldo;
    private boolean status;
    private List<Transacao> transacaos;

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String getNumero() {
        return "";
    }

    public Identificador<String> getNumeroConta() {
        return numeroConta;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public List<Transacao> getTransacaos() {
        return transacaos;
    }

    public boolean isStatus() {
        return status;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaInvestimento(Identificador<String> numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
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
    public double consultarSaldo()
    {
        return 0;
    }
    public void criarTransacao(Transacao transacao) {
    }
}
