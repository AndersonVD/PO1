package Aulas.hierarquia;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;

    public float getTensao() {
        return this.tensao;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public float getConsumo() {
        return this.consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "{" +
                " tensao='" + getTensao() + "'" +
                ", consumo='" + getConsumo() + "'" +
                "}";
    }

}
