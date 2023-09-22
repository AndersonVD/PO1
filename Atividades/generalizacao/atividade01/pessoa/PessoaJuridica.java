package Atividades.generalizacao.atividade01.pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String tipoEmpresa;

    public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.tipoEmpresa = tipoEmpresa;
    }

    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", tipoEmpresa=" + tipoEmpresa + "]";
    }

}
