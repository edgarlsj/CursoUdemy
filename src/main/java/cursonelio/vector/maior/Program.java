package cursonelio.vector.maior;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int posicao = 0;

        System.out.println(" Quantos numeros vc vai digitar?");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i ;
            }

        }
        System.out.printf("MAIOR VALOR=  %d%n \n\n", maior);
        System.out.printf("POSIÇÃO NO VETOR = %d%n", posicao);


        sc.close();
    }

}
