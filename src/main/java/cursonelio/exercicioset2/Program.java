package cursonelio.exercicioset2;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many studants for course A? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int idNumber = scanner.nextInt();
            a.add(idNumber);
        }

        System.out.print("How many studants for course B? ");
        int n2 = scanner.nextInt();

        for (int i = 0; i < n2; i++) {
            int idNumber = scanner.nextInt();
            b.add(idNumber);
        }

        System.out.print("How many studants for course C? ");
        int n3 = scanner.nextInt();

        for (int i = 0; i < n3; i++) {
            int idNumber = scanner.nextInt();
            c.add(idNumber);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total Student: "+ total.size());

        System.out.println("________________________________________________");

        for (Integer value: total) {
            System.out.println("-"+ value);

        }

        scanner.close();



    }
}
