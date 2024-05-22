package cursonelio.map.application;

import cursonelio.map.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 7900.0);
        Product p2 = new Product("Celular", 1555.0);
        Product p3 = new Product("Notebook", 8000.0);
        Product p4 = new Product("Monitor", 350.00);

        stock.put(p1,1000.0);
        stock.put(p2,2000.0);
        stock.put(p3,3000.0);

        Product ps = new Product("TV", 7900.0);

        System.out.println("COntains 'ps' key  - "+ stock.containsKey(ps));









        scanner.close();
    }
}
