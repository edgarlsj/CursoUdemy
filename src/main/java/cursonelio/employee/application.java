package cursonelio.employee;

import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println(" Digite o nome , salario bruto e imposto do funcionario");
        employee.setName(sc.next());
        employee.setSalary(sc.nextDouble());
        employee.setTax(sc.nextDouble());

        System.out.println(employee);


        System.out.println(" digite a porcentagem de inclemento do salario");
        employee.increaseSalary(sc.nextDouble());

        System.out.println(employee);

        sc.close();
    }
}
