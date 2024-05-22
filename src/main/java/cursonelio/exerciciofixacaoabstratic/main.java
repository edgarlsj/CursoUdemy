package cursonelio.exerciciofixacaoabstratic;

import cursonelio.exerciciofixacaoabstratic.entitites.Company;
import cursonelio.exerciciofixacaoabstratic.entitites.Individual;
import cursonelio.exerciciofixacaoabstratic.entitites.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char c = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income ");
            double anualIncome = sc.nextDouble();

            if (c == 'i' || c == 'I') {

                System.out.print("Health Expentures ");
                double health = sc.nextDouble();
                list.add(new Individual(name, anualIncome, health));

            }
            if (c == 'c' || c == 'C') {
                System.out.print("Number employees ");
                int employees = sc.nextInt();
                list.add(new Company(name, anualIncome, employees));
            }
        }
        System.out.println("TAXES PAID");
        System.out.println();
        double sum = 0.0;

        for (Person person : list) {
            System.out.println(person.getName() + ":  $ " + String.format("%.2f", person.tax()));
            sum += person.tax();
        }

        System.out.println("Total Taxes:  "+ String.format("%.2f", sum) );

        sc.close();
    }
}
