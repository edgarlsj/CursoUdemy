package cursonelio.composicao;

import cursonelio.composicao.entities.Department;
import cursonelio.composicao.entities.Worker;
import cursonelio.composicao.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class program_composicao {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter worker data:  ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Worker level:  ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary:  ");
        Double baseSalary = sc.nextDouble();
        Worker worker = new Worker(departamentName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));

        System.out.println("How many contracts to this worker?  ");
        int n = sc.nextInt();


        for (int i = 1; i < n; i++) {
            System.out.println("Enter contract # " + i + "data: ");
            System.out.println("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println(" Value Per Hour:  ");
            Double valuePerHour = sc.nextDouble();
            System.out.println(" DUration (hours)  ");
            int duration = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income(MM/YYYY):  ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ":  " + String.format("%.2f", worker.income(year, month)));


        sc.close();

    }
}
