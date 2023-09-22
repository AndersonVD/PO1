package Atividades.generalizacao.atividade02.animal;

public class Lagarto extends Reptil {

    public Lagarto(String nome, int idade, String som, String corEscama) {
        super(nome, idade, som, corEscama);
    }

    public void locomover() {
        System.out.println("Andando beeeem devagar...");
    }
}
