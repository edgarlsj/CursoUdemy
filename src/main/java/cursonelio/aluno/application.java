package cursonelio.aluno;



import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno e suas respectivas notas");
        aluno.setNome(sc.next());
        aluno.setN1(sc.nextDouble());
        aluno.setN2(sc.nextDouble());
        aluno.setN3(sc.nextDouble());



        System.out.printf(" Final Grade:  %.2f%n", aluno.calculoNotas());

        if (aluno.calculoNotas() < 60.00){
            System.out.println(" reprovado");
            System.out.println(" falta " + aluno.faltaPontos());

        }else {
            System.out.println(" aprovado");

        }





        sc.close();
    }
}
