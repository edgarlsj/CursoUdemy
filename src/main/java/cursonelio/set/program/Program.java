package cursonelio.set.program;

import cursonelio.set.entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("TV");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String list : set) {
            System.out.println(list);

            System.out.println("_____________________________________________________________");
            Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10)); //adiiona os elementos de um array para o set
            Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));



            //add no conjunto os elementos do outro conjunto, sem repetiçao
            Set<Integer> c = new TreeSet<>(a);
            c.addAll(b);
            System.out.println(c);

            //remove do conjunto os elementos não contidos na outra lista
            Set<Integer> d = new TreeSet<>(a);
            d.retainAll(b);
            System.out.println(d);

            //remove do conjunto os elementos contidos na outra lista
            Set<Integer> e = new TreeSet<>(a);
            e.removeAll(b);
            System.out.println(e);


            System.out.println(c.size());
            System.out.println("limpando o conjunto!");
            a.clear();
            b.clear();
            c.clear();
            e.clear();
            d.clear();

            System.out.println(a + "a");
            System.out.println(b + "b");
            System.out.println(c + "c");
            System.out.println(d + "d");


            System.out.println("//teste de iqualdade entre coleçoes___________");
            System.out.println();

            //teste de iqualdade entre coleçoes

            Set<Product> set1 = new HashSet<>();

            set1.add(new Product(1000.00,"celular"));
            set1.add(new Product(64.6,"capa celular"));
            set1.add(new Product(80.00,"carregador"));
            set1.add(new Product(52.00,"pelicula"));

            Product product = new Product(1000.00,"celular");

            Boolean test = false;

            for (Product p: set1) {
                if (p.getName().equals(product.getName()));
                test = true;
                break;
            }

            System.out.println(test);

        }

    }
}
