package Atividades.generalizacao.atividade04.bomba;

public class BombaEtanol extends Bomba {
    private String tipoCombustivel;

    public BombaEtanol(double totalLitros, float valorLitro, String tipoCombustivel) {
        super(totalLitros, valorLitro);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
}
