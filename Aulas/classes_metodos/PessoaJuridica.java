package Aulas.classes_metodos;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    PessoaJuridica(String nome) {
        super(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PessoaJuridica [cnpj=");
        builder.append(cnpj);
        builder.append("]\n");
        builder.append(super.toString());
        return builder.toString();
    }
}
