package com.ada.infra;

import com.ada.conta.Conta;

import java.util.List;

public class ContaRepositorioImpl implements ContaRepositorio{
    public ContaRepositorioImpl() {

        List<Conta> contas;
    }

    @Override
    public Conta buscarPorCliente(Conta conta) {
        return null;
    }

    @Override
    public Conta buscarPorNumero(Conta conta) {
        return null;
    }

    @Override
    public void salvar(Conta conta) {

    }

    @Override
    public Conta buscarContas(Conta conta) {
        return null;
    }

    @Override
    public List<Conta> buscarContasCliente() {
        return List.of();
    }

    @Override
    public void atualizar(Conta conta) {

    }
}
