package Atividades.generalizacao.atividade03.ambiente;

public class Cozinha  extends Ambiente{
    private boolean microondas;

    public Cozinha(float area, boolean microondas) {
        super(area);
        this.microondas = microondas;
    }
}
