package Atividades.generalizacao.atividade01.item;

public class Livro extends Item {
    private String autor;

    public Livro(int codigo, String descricao, String autor) {
        super(codigo, descricao);

    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", toString()=" + super.toString() + "]";
    }
}