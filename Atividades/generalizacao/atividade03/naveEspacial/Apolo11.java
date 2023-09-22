package Atividades.generalizacao.atividade03.naveEspacial;

public class Apolo11 extends NaveEspacial {
    private String tipoCombustivel;

    public Apolo11(double velocidadMaxima, String tipoCombustivel) {
        super(velocidadMaxima);
        this.tipoCombustivel = tipoCombustivel;
    }
}
