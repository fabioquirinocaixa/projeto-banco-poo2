package com.ada.conta;

import com.ada.cliente.Cliente;

public interface Conta {
    Cliente getCliente();
    String getNumero();

    double sacar(double valor);
    double depositar(double valor);
    void transferir(double valor, Conta contaDestino);

    /*private double saldo;
    public void transferir(double valor, Conta contaDestino){

        if (this.saldo < valor){
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }*/
    double consultarSaldo();

    void criarTransacao(Transacao transacao);

}
