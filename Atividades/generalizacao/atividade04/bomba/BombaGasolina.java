package Atividades.generalizacao.atividade04.bomba;

public class BombaGasolina  extends Bomba{
    private String tipoCombustivel;

    public BombaGasolina(double totalLitros, float valorLitro, String tipoCombustivel) {
        super(totalLitros, valorLitro);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
}
