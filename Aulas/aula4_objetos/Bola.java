package Aulas.aula4_objetos;

public class Bola {
    private int tamanho = 2;
    private String esporte = "Futebol";
    private int peso = 3;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        if (tamanho > 0)
            this.tamanho = tamanho;
    }

    public String getEsporte() {
        return this.esporte;
    }

    public void setEsporte(String esporte) {
        if (esporte.length() > 1)
            this.esporte = esporte;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
