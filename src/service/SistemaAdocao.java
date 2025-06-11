package service;

import model.*;
import util.Persistencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaAdocao {
    private List<Animal> animais;
    private List<Adotante> adotantes;
    private List<Adocao> adocoes;
    private int idAnimal = 1;
    private int idAdocao = 1;

    public SistemaAdocao() {
        animais = Persistencia.carregar("dados/animais.bin");
        adotantes = Persistencia.carregar("dados/adotantes.bin");
        adocoes = Persistencia.carregar("dados/adocoes.bin");

        if (animais == null) animais = new ArrayList<>();
        if (adotantes == null) adotantes = new ArrayList<>();
        if (adocoes == null) adocoes = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        idAnimal++;
        Persistencia.salvar(animais, "dados/animais.bin");
    }

    public List<Animal> listarDisponiveis() {
        List<Animal> disponiveis = new ArrayList<>();
        for (Animal a : animais) {
            if (!a.isAdotado()) disponiveis.add(a);
        }
        return disponiveis;
    }

    public void cadastrarAdotante(Adotante adotante) {
        adotantes.add(adotante);
        Persistencia.salvar(adotantes, "dados/adotantes.bin");
    }

    public void realizarAdocao(int idAnimal, Adotante adotante) {
        for (Animal a : animais) {
            if (a.getId() == idAnimal && !a.isAdotado()) {
                Adocao ad = new Adocao(idAdocao++, a, adotante, LocalDate.now());
                adocoes.add(ad);
                Persistencia.salvar(adocoes, "dados/adocoes.bin");
                Persistencia.salvar(animais, "dados/animais.bin");
                System.out.println("Adocao realizada com sucesso!");
                return;
            }
        }
        System.out.println("Animal nao encontrado ou ja adotado.");
    }

    public void listarAdocoes() {
        for (Adocao ad : adocoes) {
            System.out.println(ad);
        }
    }
}