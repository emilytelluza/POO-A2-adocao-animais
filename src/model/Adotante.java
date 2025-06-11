package model;

public class Adotante extends Pessoa {
    private String endereco;
    private String telefone;

    public Adotante(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
    }
}