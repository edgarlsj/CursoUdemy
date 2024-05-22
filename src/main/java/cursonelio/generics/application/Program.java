package cursonelio.generics.application;

import cursonelio.generics.service.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        PrintService <String> ps = new PrintService<>();


        System.out.print("How many values? ");//quantos valores
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String values = sc.next();
            ps.addValue(values);
        }

        ps.print();
        System.out.print("First: "+ ps.first());

        sc.close();
    }
}
