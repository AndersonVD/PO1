package Atividades.generalizacao.atividade03.ambiente;

public class Sala extends Ambiente {
    private boolean tv;

    public Sala(float area, boolean tv) {
        super(area);
        this.tv = tv;
    }
}
