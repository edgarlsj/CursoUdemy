package cursonelio.interfacecompareble.application;

import cursonelio.interfacecompareble.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");//split para separar os campos
                String name = fields[0];//pegando o primeiro campo e convertendo para string
                double salary = Double.parseDouble(fields[1]);//pegando o segundo campo e convertendo para double
                list.add(new Employee(name, salary));
                line = br.readLine();//
            }
            Collections.sort(list);
            for (Employee list1:list) {
                System.out.println(list1.getName()+", "+list1.getSalary());//

            }

        }catch (IOException e){
            System.out.println("error de read" + e.getMessage());
        }
    }
}
