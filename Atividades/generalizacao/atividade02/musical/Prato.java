package Atividades.generalizacao.atividade02.musical;

public class Prato extends InstrumentoMusical {
    private String nome;
    private String tipo;
    private String cor;

    public Prato(String nome, String tipo, String cor) {
        super(nome, tipo, cor);
    }

    public void tocar() {
        System.out.println("Tocando prato...");
    }

    public void afinar() {
        System.out.println("Afinando prato...");
    }

    public void limpar() {
        System.out.println("Limpando prato...");
    }

    public void guardar() {
        System.out.println("Guardando prato...");
    }
}
