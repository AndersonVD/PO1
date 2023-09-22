package Atividades.generalizacao.atividade01.simples;

public class ContaSimples extends Conta {
    private double saldoPoupanca;

    public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca) {
        super(banco, agencia, numeroconta, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor) {
        this.saldoPoupanca += valor;
        return true;
    }

    public boolean saquePoupanca(double valor) {
        this.saldoPoupanca -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "ContaSimples [saldoPoupanca=" + saldoPoupanca + ", toString()=" + super.toString() + "]";
    }

}
