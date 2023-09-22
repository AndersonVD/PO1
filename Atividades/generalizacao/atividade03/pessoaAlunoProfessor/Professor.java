package Atividades.generalizacao.atividade03.pessoaAlunoProfessor;

public class Professor  extends Pessoa {
    private String disciplina;

    public Professor(String nome, int codigo, String endereco, String disciplina) {
        super(nome, codigo, endereco);
        this.disciplina = disciplina;
    }
}
