package Aulas.classes_metodos;

public class PessoaFisica extends Pessoa {

    PessoaFisica(String nome) {
        super(nome);
    }

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PessoaFisica [cpf=");
        builder.append(cpf);
        builder.append("]\n");
        builder.append("PessoaFisica [nome=");
        builder.append(super.toString());
        return builder.toString();
    }

}
