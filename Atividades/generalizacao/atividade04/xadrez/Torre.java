package Atividades.generalizacao.atividade04.xadrez;

public class Torre extends Peca {
    private int linha;
    private int coluna;
    private boolean cor;

    public Torre(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int linha, int coluna) {
        if (linha == this.linha || coluna == this.coluna) {
            this.linha = linha;
            this.coluna = coluna;
            return true;
        }
        return false;
    }
}
