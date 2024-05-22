package cursonelio.exercicioset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entry file full path");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // garantir que o recurso (BufferedReader)  seja fechado automaticamente após o uso





        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
