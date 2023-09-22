package Atividades.generalizacao.atividade04.bomba;

public class BombaDiesel extends Bomba {
    private String tipoCombustivel;

    public BombaDiesel(double totalLitros, float valorLitro, String tipoCombustivel) {
        super(totalLitros, valorLitro);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
}
