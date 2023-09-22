package Atividades.generalizacao.atividade01.simples;

public class Conta {
    private String banco;
    private int agencia;
    private int numeroconta;
    private double saldo;

    public Conta(String banco, int agencia, int numeroconta, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
    }

    public boolean deposito(double valor) {
        this.saldo += valor;
        return true;
    }

    public boolean saque(double valor) {
        this.saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", banco=" + banco + ", numeroconta=" + numeroconta + ", saldo=" + saldo
                + "]";
    }
}
