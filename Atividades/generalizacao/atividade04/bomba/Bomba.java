package Atividades.generalizacao.atividade04.bomba;

public class Bomba {
    private double totalLitros;
    private float valorLitro;

    public Bomba(double totalLitros, float valorLitro) {
        this.totalLitros = totalLitros;
        this.valorLitro = valorLitro;
    }

    public boolean abastecerPorLitros(double litros) {
        if (litros > 0 && litros <= this.totalLitros) {
            this.totalLitros -= litros;
            return true;
        }
        return false;
    }

    public boolean abastecerPorValor(float valor) {
        if (valor > 0 && valor <= this.totalLitros * this.valorLitro) {
            this.totalLitros -= valor / this.valorLitro;
            return true;
        }
        return false;
    }
}
