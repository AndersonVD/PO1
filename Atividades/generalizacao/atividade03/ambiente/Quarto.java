package Atividades.generalizacao.atividade03.ambiente;

public class Quarto extends Ambiente {  
    private int capacidade;

    public Quarto(float area, int capacidade) {
        super(area);
        this.capacidade = capacidade;
    }
}
