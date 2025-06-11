package model;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    protected int id;
    protected String nome;
    protected String raca;
    protected int idade;
    protected boolean adotado;

    public Animal(int id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.adotado = false;
    }

    public abstract String getDescricao();

    public int getId() { return id; }
    public String getNome() { return nome; }
    public boolean isAdotado() { return adotado; }
    public void setAdotado(boolean adotado) { this.adotado = adotado; }

    @Override
    public String toString() {
        return id + " - " + nome + " (" + raca + ", " + idade + " anos)" + (adotado ? " [ADOTADO]" : "");
    }
}