package Atividades.generalizacao.atividade02.animal;

public class Cao extends Mamifero {
    private String raca;

    public Cao(String nome, int idade, String som, String alimento, String raca) {
        super(nome, idade, som, alimento);
        this.raca = raca;
    }

    public void latir() {
        System.out.println("Au au...");
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
