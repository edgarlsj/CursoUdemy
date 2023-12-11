package cursonelio.forech;

import java.util.ArrayList;

public class main  {
    public static void main(String[] args) {

        String[] vect = new String[]{"Edgar","Viviane","Alex" };



        for (int i =0 ; i < vect.length; i++ ){
            System.out.println(vect[i]);

        }

        int contador = 0;
        for (String obj: vect) {
             contador ++;
            System.out.println(obj);
            System.out.println(contador);

        }



    }
}
