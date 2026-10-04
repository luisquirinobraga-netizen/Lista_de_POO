package model;

public class ContaCorrente {

    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(float valor) {
        if (valor > 10000) {
            System.out.println("Erro: O saque não pode aceitar valores superiores à R$10000.");
        }
        else if (valor > saldo) {
            System.out.println("Erro: O saque não pode aceitar valores superiores ao saldo.");
        }
        else if (valor <= 0) {
            System.out.println("Erro: O saque não pode aceitar valores inferiores ou iguais à zero.");
        }
        else {
            saldo = saldo - valor;
        }
    }

    public void depositar(float valor) {
        if (valor > 10000) {
            System.out.println("Erro: O depósito não pode aceitar valores superiores à R$10000.");
        }
        else if (valor <= 0) {
            System.out.println("Erro: O depósito não pode aceitar valores inferiores ou iguais à zero.");
        }
        else {
            saldo = saldo + valor;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

}