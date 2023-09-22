package Atividades.generalizacao.atividade02.veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(boolean motor, int portas) {
        super(motor);
        this.portas = portas;
    }
}
