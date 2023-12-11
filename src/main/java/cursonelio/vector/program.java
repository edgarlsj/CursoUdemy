package cursonelio.vector;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*System.out.println(" digite o numero de posiçoes do vetor");
        int n = sc.nextInt();
        Double[] vector = new Double[n];

        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vector [i];

        }
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT  %.2f%n", avg);*/

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i ++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("Average height %.2f%n", avg);

            sc.close();


    }
}
