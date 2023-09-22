package Atividades.generalizacao.atividade02.animal;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, int idade, String som, String alimento) {
        super(nome, idade, som);
        this.alimento = alimento;
    }

    public void mamar() {
        System.out.println("Mamando...");
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

}