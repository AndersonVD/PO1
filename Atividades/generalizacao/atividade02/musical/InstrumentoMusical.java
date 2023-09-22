package Atividades.generalizacao.atividade02.musical;

public class InstrumentoMusical {
    private String nome;
    private String tipo;
    private String cor;

    public InstrumentoMusical(String nome, String tipo, String cor) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
    }

    public void tocar() {
        System.out.println("Tocando...");
    }

    public void afinar() {
        System.out.println("Afinando...");
    }

    public void limpar() {
        System.out.println("Limpando...");
    }

    public void guardar() {
        System.out.println("Guardando...");
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cor: " + this.cor);
    }
}
