package model;

public class Cachorro extends Animal {
    private String porte;
    private boolean necessitaPasseio;

    public Cachorro(int id, String nome, String raca, int idade, String porte, boolean necessitaPasseio) {
        super(id, nome, raca, idade);
        this.porte = porte;
        this.necessitaPasseio = necessitaPasseio;
    }

    @Override
    public String getDescricao() {
        return "Cachorro - Porte: " + porte + ", Passeio: " + (necessitaPasseio ? "Sim" : "Não");
    }
}