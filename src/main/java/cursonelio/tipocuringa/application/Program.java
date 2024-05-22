package cursonelio.tipocuringa.application;

import cursonelio.tipocuringa.entities.Circle;
import cursonelio.tipocuringa.entities.Rectangle;
import cursonelio.tipocuringa.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        list.add(new Rectangle(5,6));
        list.add(new Circle(6));

        System.out.print("Total Area: "+ totalArea(list));

        System.out.println();


        String a = "Edgar";
        String b = "Edgar";


        if (a.hashCode() == b.hashCode()){
            System.out.println("iguais");
        }else{
            System.out.println("diferenrentes");
        }

    }

    public static double totalArea (List<Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();

        }
        return sum;


    }
}
