package cursonelio.leituraescritadearquivo.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//classe de exemplo de leitura de arquivo txt, utilizando o classe file.


public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\Formação Java\\in.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("Erro:  "+ e.getMessage());
        }
        finally {
            if (scanner != null){
                scanner.close();
            }

        }
    }
}
