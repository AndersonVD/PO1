package Atividades.generalizacao.atividade02.animal;

public class Reptil extends Animal {
    private String corEscama;

    public Reptil(String nome, int idade, String som, String corEscama) {
        super(nome, idade, som);
        this.corEscama = corEscama;
    }

    public void trocarPele() {
        System.out.println("Trocando de pele...");
    }

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
