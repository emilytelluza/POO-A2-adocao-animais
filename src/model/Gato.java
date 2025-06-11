package model;

public class Gato extends Animal {
    private String tipoPelagem;
    private boolean independente;

    public Gato(int id, String nome, String raca, int idade, String tipoPelagem, boolean independente) {
        super(id, nome, raca, idade);
        this.tipoPelagem = tipoPelagem;
        this.independente = independente;
    }

    @Override
    public String getDescricao() {
        return "Gato - Pelagem: " + tipoPelagem + ", Independente: " + (independente ? "Sim" : "Não");
    }
}