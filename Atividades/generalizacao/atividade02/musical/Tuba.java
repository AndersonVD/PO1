package Atividades.generalizacao.atividade02.musical;

public class Tuba extends InstrumentoMusical {
        
            public Tuba(String nome, String tipo, String cor) {
                super(nome, tipo, cor);
            }
        
            public void tocar() {
                System.out.println("Tocando tuba...");
            }
        
            public void afinar() {
                System.out.println("Afinando tuba...");
            }
        
            public void limpar() {
                System.out.println("Limpando tuba...");
            }
        
            public void guardar() {
                System.out.println("Guardando tuba...");
            }
}
