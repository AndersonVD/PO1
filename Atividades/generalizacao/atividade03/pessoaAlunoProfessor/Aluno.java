package Atividades.generalizacao.atividade03.pessoaAlunoProfessor;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int codigo, String endereco, int matricula) {
        super(nome, codigo, endereco);
        this.matricula = matricula;
    }
}
