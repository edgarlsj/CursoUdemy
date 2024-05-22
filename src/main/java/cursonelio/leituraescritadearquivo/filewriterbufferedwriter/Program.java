package cursonelio.leituraescritadearquivo.filewriterbufferedwriter;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]{"linha 1", "linha 2", "linha 3", "linha 4"};
        String path = "C:\\Formação Java\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //na serve para não recriar o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error:   " + e.getMessage());
        }
        System.out.println("Arquivo criado com sucesso! : "+ path);
    }
}
