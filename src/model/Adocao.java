package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Adocao implements Serializable {
    private int id;
    private Animal animal;
    private Adotante adotante;
    private LocalDate data;

    public Adocao(int id, Animal animal, Adotante adotante, LocalDate data) {
        this.id = id;
        this.animal = animal;
        this.adotante = adotante;
        this.data = data;
        this.animal.setAdotado(true);
    }

    @Override
    public String toString() {
        return "Adocao #" + id + " - " + animal.getNome() + " por " + adotante.getNome() + " em " + data;
    }
}