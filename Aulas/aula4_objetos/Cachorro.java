package Aulas.aula4_objetos;

public class Cachorro {
    private float peso;
    private float tamanho;
    private String raca;
    private String nome;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Peso: %f ", getPeso()));
        builder.append("Tamanho: " + getTamanho());
        builder.append("Nome: " + getNome());
        builder.append("Raça: " + getRaca());
        return builder.toString();
    }

    public Cachorro() {

    }

    public Cachorro(float tamanho, float peso, String nome, String raca) {
        setNome(nome);
        setPeso(peso);
        setRaca(raca);
        setTamanho(tamanho);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso > 0)
            this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca.length() > 0)
            this.raca = raca;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        if (tamanho > 0)
            this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0)
            this.nome = nome;
    }

}
