package Atividades.generalizacao.atividade01.pessoa;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
    }

}
