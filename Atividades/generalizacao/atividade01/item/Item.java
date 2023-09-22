package Atividades.generalizacao.atividade01.item;

public class Item {
    private int codigo;
    private String descricao;

    public Item(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;

    }

    @Override
    public String toString() {
        return "Item [codigo=" + codigo + ", descricao=" + descricao + "]";
    }

}
