package cursonelio.listexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Maria"); //adicionar elementos a Lista
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Americo");

        list.add(2, "Marco"); //alterar a posição do elemento
        System.out.println(list.size());//a função size é para mostra a quantidades de posiçoes da lista


        for (String x : list) {
            System.out.println(x);


        }
        System.out.println("______________________");
        list.remove(1);// removendo elementos da lista posição "1"
        list.removeIf(x -> x.charAt(0) == 'M');//Predicado de função lambda para encontrar e remover tds elementos que começam com 'M'

        for (String x : list) {
            System.out.println(x);


        }
        System.out.println("______________________");
        System.out.println("Index of Viviane  " + list.indexOf("Viviane"));//procurar todos nomes
        System.out.println("Index of Isaque" + list.indexOf("Isaque"));
        System.out.println("------------------------------------");

        List<String> result ;
                result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);





    }



}
