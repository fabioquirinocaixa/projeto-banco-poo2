package com.ada.infra;

import com.ada.conta.Conta;

import java.util.List;

public interface ContaRepositorio {
    void atualizar(Conta conta);

    Conta buscarPorCliente(Conta conta);
    Conta buscarPorNumero(Conta conta);

    void salvar(Conta conta);
    Conta buscarContas(Conta conta);
    List<Conta> buscarContasCliente();

}
