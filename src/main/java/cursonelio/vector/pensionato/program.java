package cursonelio.vector.pensionato;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];

        System.out.println("quantos quartos serão alugados");
        int n = sc.nextInt();



        for (int i = 1; i <= n; i++) {
            System.out.printf("Aluguel #%d%n", i);
            System.out.print("Name:  ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("email:  ");
            String email = sc.next();
            System.out.print("quarto:  ");
            int room = sc.nextInt();
            students[room]  = new Student(name, email);
        }
        System.out.println();
        System.out.println("Quartos Alugados");
        for (int i = 0; i < 10; i++) {
            if (students[i] != null) {
                System.out.println(i + ": " + students[i]);
            }


        }

        sc.close();
    }
}
