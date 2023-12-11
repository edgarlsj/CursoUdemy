package cursonelio.vector;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.println(" Quantos numeros vc vai digitar?");
        n = sc.nextInt();

        Double[] vect = new Double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf(" digite os numeros");
            vect[i] = sc.nextDouble();

        }

        soma = 0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        media = soma / vect.length;

        System.out.println("valores =");

        for (int i= 0; i < vect.length ; i++){
            System.out.printf(" %.1f", vect[i]);
        }

        System.out.printf("SOMA = %.2f%", soma);
        System.out.printf("MEDIA = %.2f%", media);
    }
}
