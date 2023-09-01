package Aulas.aula4_objetos;

public class CachorroMain {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.setPeso(2);
        c.setNome("Solas");
        c.setRaca("Golden");
        c.setTamanho(4);

        System.out.println(c);

    }
}
