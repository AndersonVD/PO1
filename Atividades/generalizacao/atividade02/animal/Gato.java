package Atividades.generalizacao.atividade02.animal;

public class Gato extends Mamifero {
    private String raca;

    public Gato(String nome, int idade, String som, String alimento, String raca) {
        super(nome, idade, som, alimento);
        this.raca = raca;
    }

    public void miar() {
        System.out.println("Miau...");
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
