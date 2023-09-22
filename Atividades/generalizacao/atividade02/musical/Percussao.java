package Atividades.generalizacao.atividade02.musical;

public class Percussao extends InstrumentoMusical {
    private String nome;
    private String tipo;
    private String cor;

    public Percussao(String nome, String tipo, String cor) {
        super(nome, tipo, cor);
    }

    public void tocar() {
        System.out.println("Tocando percussão...");
    }

    public void afinar() {
        System.out.println("Afinando percussão...");
    }

    public void limpar() {
        System.out.println("Limpando percussão...");
    }

    public void guardar() {
        System.out.println("Guardando percussão...");
    }
}
