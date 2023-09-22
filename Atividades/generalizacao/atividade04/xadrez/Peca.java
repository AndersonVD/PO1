package Atividades.generalizacao.atividade04.xadrez;

public class Peca {
    private int linha;
    private int coluna;
    private boolean cor;
    private int movimentos;

    public Peca(int linha, int coluna, boolean cor) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.movimentos = 0;
    }

    public boolean mover(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.movimentos++;
        return true;
    }

}
