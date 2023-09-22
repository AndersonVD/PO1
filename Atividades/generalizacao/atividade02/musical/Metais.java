package Atividades.generalizacao.atividade02.musical;

public class Metais extends InstrumentoMusical {
        
            public Metais(String nome, String tipo, String cor) {
                super(nome, tipo, cor);
            }
        
            public void tocar() {
                System.out.println("Tocando metais...");
            }
        
            public void afinar() {
                System.out.println("Afinando metais...");
            }
        
            public void limpar() {
                System.out.println("Limpando metais...");
            }
        
            public void guardar() {
                System.out.println("Guardando metais...");
            }
}
