package Atividades.generalizacao.atividade02.veiculo;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(boolean motor, int cilindradas) {
        super(motor);
        this.cilindradas = cilindradas;
    }
}
