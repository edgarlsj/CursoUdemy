package cursonelio.listexample.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeesList = new ArrayList<>();


        System.out.printf("Quantos funcionarios vc deseja adicionar?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Funcionario #%d:%n:", i + 1);
            System.out.println("Digite o ID do funcionario: ");
            Integer id = sc.nextInt();
            System.out.printf("Digite o nome do funcionario: ");
            sc.nextLine();
            String name = sc.next();
            System.out.printf("Digite o salario do funcionario: ");
            Double salary = sc.nextDouble();
            employeesList.add(new Employee(name, salary, id)); //criamos construtor

        }

        System.out.println("ENtre com o Id de funcioanrio que receberá aumento de salario:");
        Integer idSeach = sc.nextInt();

        //variavel do tipo Employee
        Employee emp = employeesList.stream().filter(x -> x.getId() == idSeach).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist");
        } else {
            System.out.println("Entre com a porcentagem");
            Double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);

        }
        System.out.println("List of employees");
        for (Employee list : employeesList) {
            System.out.println(list);

        }

        sc.close();
    }

    public Integer position(List<Employee> list, Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == null) {
                return i;
            }
        }
        return null;

    }

}

