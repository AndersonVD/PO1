package Atividades.generalizacao.atividade02.musical;

public class Madeiras extends InstrumentoMusical {
    private String nome;
    private String tipo;
    private String cor;

    public Madeiras(String nome, String tipo, String cor) {
        super(nome, tipo, cor);
    }
    public void tocar() {
        System.out.println("Tocando madeiras...");
    }

    public void afinar() {
        System.out.println("Afinando madeiras...");
    }

    public void limpar() {
        System.out.println("Limpando madeiras...");
    }

    public void guardar() {
        System.out.println("Guardando madeiras...");
    }
}
