package Aulas.aula4_objetos;

public class BojaMain {
    public static void main(String[] args) {
        Bola b = new Bola();

        b.setEsporte("");
        b.setPeso(2);
        b.setTamanho(2);

        System.out.println(b.getEsporte());
        System.out.println(b.getPeso());
        System.out.println(b.getTamanho());
    }
}
