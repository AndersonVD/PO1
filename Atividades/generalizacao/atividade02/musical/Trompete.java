package Atividades.generalizacao.atividade02.musical;

public class Trompete extends InstrumentoMusical {
    private int tamanho;
    private String nome;
    private String tipo;    
    private String cor;

    public Trompete(String nome, String tipo, String cor, int tamanho) {
        super(nome, tipo, cor);
        this.tamanho = tamanho;
    }

    public void tocar() {
        System.out.println("Tocando trompete...");
    }

    public void afinar() {
        System.out.println("Afinando trompete...");
    }

    public void limpar() {
        System.out.println("Limpando trompete...");
    }

    public void guardar() {
        System.out.println("Guardando trompete...");
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
    }
}
