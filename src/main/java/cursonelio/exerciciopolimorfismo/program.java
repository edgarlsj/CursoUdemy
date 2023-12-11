package cursonelio.exerciciopolimorfismo;

import cursonelio.exerciciopolimorfismo.entitites.Employee;
import cursonelio.exerciciopolimorfismo.entitites.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees:  ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + "cursonelio/data");
            ;
            System.out.print("Outsource (y/n)? ");
            char cg = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Hours  ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour  ");
            double valuePerHour = sc.nextDouble();

            if (cg == 'y') {
                System.out.print("Additonal charge:  ");
                double additionalCharge = sc.nextDouble();
                Employee employeeList = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(employeeList);
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("Payments");
        for (Employee employee : list) {
            System.out.println(employee.getName() + "-  R$" + employee.payment());

        }
        sc.close();

    }
}
