package Atividades.generalizacao.atividade03.ambiente;

public class Banheiro extends Ambiente {
    private boolean banheira;

    public Banheiro(float area, boolean banheira) {
        super(area);
        this.banheira = banheira;
    }
}
