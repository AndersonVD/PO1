package Aulas.classes_metodos;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Nome aq");
        System.out.println(p);

        PessoaFisica pf = new PessoaFisica("Malu");
        pf.setCpf("444444");
        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica("IFC");
        pj.setCnpj("987987987");
        System.out.println(pj);
    }
}
