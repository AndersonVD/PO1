package Atividades.generalizacao.atividade02.musical;

public class Violao extends InstrumentoMusical {
    private int tamanho;
    private String nome;
    private String tipo;    
    private String cor;

    public Violao(String nome, String tipo, String cor, int tamanho) {
        super(nome, tipo, cor);
        this.tamanho = tamanho;
    }

    public void tocar() {
        System.out.println("Tocando violão...");
    }

    public void afinar() {
        System.out.println("Afinando violão...");
    }

    public void limpar() {
        System.out.println("Limpando violão...");
    }

    public void guardar() {
        System.out.println("Guardando violão...");
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
    }
}
