package cursonelio.leituraescritadearquivo.exercicio;

import cursonelio.leituraescritadearquivo.exercicio.entities.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path:  ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);

        String sourceFolderStr = sourceFile.getParent();

        boolean success;










        sc.close();
    }
}
