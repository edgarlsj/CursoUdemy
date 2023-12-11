package cursonelio.vector.altura;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" Quantas pessoas serão digitadas");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

       // int somaIdade = 0;
        int menores16 = 0;
        double somaAltura = 0;
        double mediaAltura = 0;
        double percentualMenores = 0;


        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf(" Dados da %d pessoas%n", i + 1);
            String nome = sc.next();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);

            somaAltura += pessoas[i].getAltura();
            //somaIdade += pessoas[i].getIdade();
            if (pessoas[i].getIdade() < 16) {
                menores16++;
            }
        }

        mediaAltura = somaAltura / pessoas.length;

        System.out.printf("Altura Media: %.2f%n", mediaAltura);
        percentualMenores = ((double) menores16 / pessoas.length) * 100.0;
        System.out.printf(" Porcentagem de pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }


        }
        sc.close();
    }

}

