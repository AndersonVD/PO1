package Atividades.generalizacao.atividade01.item;

public class VHS extends Midia {
    private String titulo;

    public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
        super(codigo, descricao, gravadora, duracao);
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "VHS [titulo=" + titulo + ", toString()=" + super.toString() + "]";
    }
}
