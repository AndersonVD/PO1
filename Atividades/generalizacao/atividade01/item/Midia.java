package Atividades.generalizacao.atividade01.item;

public class Midia extends Item {
    private String gravadora;
    private float duracao;

    public Midia(int codigo, String descricao, String gravadora, float duracao) {
        super(codigo, descricao);
        this.gravadora = gravadora;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Midia [duracao=" + duracao + ", gravadora=" + gravadora + ", toString()=" + super.toString() + "]";
    }
}
