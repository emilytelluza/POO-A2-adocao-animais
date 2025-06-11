package main;

import model.*;
import service.SistemaAdocao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaAdocao sistema = new SistemaAdocao();
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar cachorro");
            System.out.println("2. Cadastrar gato");
            System.out.println("3. Cadastrar adotante");
            System.out.println("4. Listar animais disponíveis");
            System.out.println("5. Realizar adoção");
            System.out.println("6. Listar adoções");
            System.out.println("0. Sair");
            opcao = sc.nextInt(); sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Raça: ");
                    String raca = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt(); sc.nextLine();
                    System.out.print("Porte: ");
                    String porte = sc.nextLine();
                    System.out.print("Necessita passeio? (true/false): ");
                    boolean passeio = sc.nextBoolean();
                    sistema.cadastrarAnimal(new Cachorro(sistema.hashCode(), nome, raca, idade, porte, passeio));
                }
                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Raça: ");
                    String raca = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt(); sc.nextLine();
                    System.out.print("Tipo de pelagem: ");
                    String pelagem = sc.nextLine();
                    System.out.print("É independente? (true/false): ");
                    boolean ind = sc.nextBoolean();
                    sistema.cadastrarAnimal(new Gato(sistema.hashCode(), nome, raca, idade, pelagem, ind));
                }
                case 3 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Endereço: ");
                    String end = sc.nextLine();
                    System.out.print("Telefone: ");
                    String tel = sc.nextLine();
                    sistema.cadastrarAdotante(new Adotante(nome, cpf, end, tel));
                }
                case 4 -> sistema.listarDisponiveis().forEach(System.out::println);
                case 5 -> {
                    System.out.print("ID do animal: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome adotante: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF adotante: ");
                    String cpf = sc.nextLine();
                    Adotante adotante = new Adotante(nome, cpf, "", "");
                    sistema.realizarAdocao(id, adotante);
                }
                case 6 -> sistema.listarAdocoes();
            }
        } while (opcao != 0);

        sc.close();
    }
}