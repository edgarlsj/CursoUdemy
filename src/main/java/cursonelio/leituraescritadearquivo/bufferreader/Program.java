package cursonelio.leituraescritadearquivo.bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        final String path = "C:\\Formação Java\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // garantir que o recurso (BufferedReader)  seja fechado automaticamente após o uso

            String line = br.readLine();

            while (line != null) { //loop continua enquanto for diferente de null
                System.out.println(line);
                line = br.readLine();

            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }

}
