package cursonelio.exerciciostriangulo;

import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        retangulo.setHeight(sc.nextDouble());
        retangulo.setWidth(sc.nextDouble());

        System.out.println("AREA ="+ retangulo.area());
        System.out.println(" PERIMETER = " + retangulo.perimeter());
        System.out.println("DIAGONAL  =" + retangulo.diagonal());

    }
}
