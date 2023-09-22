package Atividades.generalizacao.atividade02.veiculo;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(boolean motor, int eixos) {
        super(motor);
        this.eixos = eixos;
    }

}
