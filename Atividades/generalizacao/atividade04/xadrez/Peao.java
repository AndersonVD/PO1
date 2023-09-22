package Atividades.generalizacao.atividade04.xadrez;

public class Peao extends Peca {
    private int linha;
    private int coluna;
    private boolean cor;

    public Peao(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }


    @Override
    public boolean mover(int linha, int coluna) {
        if (this.cor) {
            if (linha == this.linha + 1 && coluna == this.coluna) {
                this.linha = linha;
                this.coluna = coluna;
                return true;
            }
        } else {
            if (linha == this.linha - 1 && coluna == this.coluna) {
                this.linha = linha;
                this.coluna = coluna;
                return true;
            }
        }
        return false;
    }
}
