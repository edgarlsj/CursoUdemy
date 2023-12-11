package cursonelio.vector.numeros.pares;

import java.util.Locale;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int quantidadePares = 0;

        System.out.println("Quantos numeros vc vai digitar?");
        int n = sc.nextInt();

        int[] numero = new int[n];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite um numero");
            numero[i] = sc.nextInt();

        }
        System.out.printf("Numeros pares   ----");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.printf("%d  ", numero[i]);
                quantidadePares++;

            }
        }

        System.out.printf(" \n\n Quantidade de pares %d%n", quantidadePares);

    }
}


