package com.ada;
import com.ada.conta.*;
public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("1"); //instanciada nova Conta Corrente
        conta1.depositar(100); //criado um deposito em Conta Corrente
        double saldo1 = conta1.sacar(10); //criado um saque em Conta Corrente
        System.out.println("Saldo da Conta Corrente: R$" + saldo1);// imprime saldo após transações

        ContaInvestimento conta2 = new ContaInvestimento("2"); //instanciada nova Conta Investimento
        double saldo2 = conta2.depositar(1000); //criado um deposito em Conta Investimento
        System.out.println("Sucesso, seu deposito de: R$" + saldo2 + " foi realizado"); // imprime saldo após depósito

        ContaPoupanca conta3 = new ContaPoupanca("3"); //instanciada nova Conta Poupança
        conta3.depositar(150); //criado um deposito em Conta Corrente
        double saldo3 = conta3.sacar(50); //criado um saque em Conta Poupança
        System.out.println("Saldo da Conta Poupança: R$" + saldo3); // imprime saldo após transações

        conta1.transferir(10,conta3); //criado uma transferencia de Conta Corrente para Conta Poupança
        double saldo4 = conta3.getSaldo();
        System.out.println("Saldo da Conta Corrente após tranferencia: R$" + saldo4); // imprime saldo após transações

        conta2.transferir(200, conta1);
        double saldo5 = conta1.getSaldo();
        System.out.println("Saldo da Conta Corrente após tranferencia: R$" + saldo5); // imprime saldo após transações
        double saldo6 = conta2.getSaldo();
        System.out.println("Saldo da Conta Investimento após tranferencia: R$" + saldo6); // imprime saldo após transações
    }
}
