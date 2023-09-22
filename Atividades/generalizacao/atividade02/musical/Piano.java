package Atividades.generalizacao.atividade02.musical;

public class Piano extends InstrumentoMusical {
    
        public Piano(String nome, String tipo, String cor) {
            super(nome, tipo, cor);
        }
    
        public void tocar() {
            System.out.println("Tocando piano...");
        }
    
        public void afinar() {
            System.out.println("Afinando piano...");
        }
    
        public void limpar() {
            System.out.println("Limpando piano...");
        }
    
        public void guardar() {
            System.out.println("Guardando piano...");
        }
}
