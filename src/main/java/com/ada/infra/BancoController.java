package com.ada.infra;

import com.ada.cliente.Cliente;
import com.ada.conta.Conta;
import com.ada.conta.TipoTransacao;
import com.ada.conta.Transacao;

import java.util.List;

public class BancoController {

    private ContaRepositorio contaRepositorio;

    public String abrirConta(Cliente cliente, TipoConta tipoConta) {
        return null;
    }

    public Conta buscarConta(String numero) {
        return null;
    }

    public void depositar(Conta conta, double valor) {

        Transacao transDep = new Transacao(TipoTransacao.DEPOSITO, valor);
        conta.criarTransacao(transDep);

    }

    public void sacar(Conta conta, double valor) {


        Transacao transSaque = new Transacao(TipoTransacao.SAQUE, valor);
        conta.criarTransacao(transSaque);

    }

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {

        contaOrigem.transferir(valor, contaDestino);

        Transacao transacaoTransfOrigem = new Transacao(TipoTransacao.TRANSFERENCIA, valor);
        transacaoTransfOrigem.setDestinatario(contaDestino.getCliente());
        contaOrigem.criarTransacao(transacaoTransfOrigem);

        Transacao transacaoTrasfDestino = new Transacao(TipoTransacao.TRANSFERENCIA, valor);
        transacaoTrasfDestino.setRemetente(contaOrigem.getCliente());
        contaDestino.criarTransacao(transacaoTrasfDestino);

    }

    public void investir(Conta contaOrigem, double valor) {

        Transacao transInv = new Transacao(TipoTransacao.INVESTIMENTO, valor);
        contaOrigem.criarTransacao(transInv);
    }



    public List<Conta> buscarContas(){
        return contaRepositorio.buscarContasCliente();
    }

}
