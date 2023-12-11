package cursonelio.vector.maisvelho;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String maisVelha = "";
        int idadeMais = Integer.MIN_VALUE;

        System.out.println("Quantos numero  ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n]; // inicializei o objeto pessoa

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %d a pessoa%n ", i + 1);
            System.out.print("Nome=   ");
            String nome = sc.next();
            System.out.print("Idade=  ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade); //construtor

        }

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > idadeMais){
                maisVelha = pessoas[i].getNome();
                idadeMais = pessoas[i].getIdade();

            }


        }
        System.out.println("Pessoa mais velha:");
        System.out.println("Nome: " + maisVelha);
        System.out.println("Idade: " + idadeMais);
        sc.close();
    }
}