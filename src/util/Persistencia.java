package util;

import java.io.*;
import java.util.List;

public class Persistencia {
    public static <T> void salvar(List<T> lista, String caminho) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> carregar(String caminho) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}