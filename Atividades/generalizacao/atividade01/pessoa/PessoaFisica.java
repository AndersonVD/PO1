package Atividades.generalizacao.atividade01.pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
        super(nome, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + ", estadoCivil=" + estadoCivil + ", toString()=" + super.toString() + "]";
    }

}
