package cursonelio.vector.somavetores;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numero");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("digite valores do vetor A");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("digite valores do vetor B");
        for (int i = 0; i < n; i++) {

            b[i] = sc.nextInt();
            c[i] = a[i] + b[i];
        }

        System.out.println("Vetor C (soma de A e B)");
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }

        sc.close();
    }


}





