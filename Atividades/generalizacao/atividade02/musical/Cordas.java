package Atividades.generalizacao.atividade02.musical;

public class Cordas extends InstrumentoMusical {
        
            public Cordas(String nome, String tipo, String cor) {
                super(nome, tipo, cor);
            }
        
            public void tocar() {
                System.out.println("Tocando cordas...");
            }
        
            public void afinar() {
                System.out.println("Afinando cordas...");
            }
        
            public void limpar() {
                System.out.println("Limpando cordas...");
            }
        
            public void guardar() {
                System.out.println("Guardando cordas...");
            }
}
