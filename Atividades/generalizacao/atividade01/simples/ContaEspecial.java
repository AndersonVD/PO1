package Atividades.generalizacao.atividade01.simples;

public class ContaEspecial extends Conta {
    private int diasSemJuros;
    private double limite;

    public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
        super(banco, agencia, numeroconta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite + ", toString()="
                + super.toString() + "]";
    }
}
