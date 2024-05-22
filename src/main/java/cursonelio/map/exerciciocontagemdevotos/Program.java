package cursonelio.map.exerciciocontagemdevotos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final String path = "C:\\Formação Java\\in.txt";

        Map<String, Integer> votes = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) { //loop continua enquanto for diferente de null
                String[] fields = line.split(",");
                String candidate= fields[0];
                int numberVotes = Integer.parseInt(fields[1]);

                if (votes.containsKey(candidate)){
                    int votesSoFar = votes.get(candidate);
                    votes.put(candidate,numberVotes+votesSoFar);
                }else {
                    votes.put(candidate,numberVotes);
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error read line" +e.getMessage());
        }

        for (Map.Entry<String, Integer> entry: votes.entrySet()) {
            System.out.println(entry.getKey() +": "+ entry.getValue());
            
        }


        sc.close();
    }
}