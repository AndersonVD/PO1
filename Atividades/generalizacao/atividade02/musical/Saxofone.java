package Atividades.generalizacao.atividade02.musical;

public class Saxofone extends InstrumentoMusical {

    public Saxofone(String nome, String tipo, String cor, String material) {
        super(nome, tipo, cor);
    }

    public void tocar() {
        System.out.println("Tocando saxofone...");
    }

    public void afinar() {
        System.out.println("Afinando saxofone...");
    }

    public void limpar() {
        System.out.println("Limpando saxofone...");
    }

    public void guardar() {
        System.out.println("Guardando saxofone...");
    }

}
