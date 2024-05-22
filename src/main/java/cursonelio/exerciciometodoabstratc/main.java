package cursonelio.exerciciometodoabstratc;

import cursonelio.exerciciometodoabstratc.entities.Circle;
import cursonelio.exerciciometodoabstratc.entities.Rectangle;
import cursonelio.exerciciometodoabstratc.entities.Shape;
import cursonelio.exerciciometodoabstratc.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes:  ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape # "+ i + "data: " );
            System.out.println("Rectangle or Circle (r/c)? ");
            char c = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED");
            Color color = Color.valueOf(sc.next());
            if (c == 'r' || c == 'R'){
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println(" Heigth");
                double heigth = sc.nextDouble();
                list.add(new Rectangle(color,width,heigth));
            }else {
                System.out.println("Radius: ");
                double radius= sc.nextDouble();

                list.add(new Circle(radius));

            }
        }
        System.out.println();
        System.out.println("Shape AREAS");
        for (Shape shape: list) {
            System.out.println(String.format("%.2f",  shape.area()));

        }

        sc.close();


    }
}
