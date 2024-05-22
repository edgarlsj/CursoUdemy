package cursonelio.exerciciopolimorfismo2;

import cursonelio.exerciciopolimorfismo2.entities.ImportedProduct;
import cursonelio.exerciciopolimorfismo2.entities.Product;
import cursonelio.exerciciopolimorfismo2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product # "+ i+ " data: ");
            System.out.print("Common, used or imported (c/u/i) ");
            char ch = sc.next().charAt(0);

            if (ch == 'c') {
                System.out.print("Name  ");
                String name = sc.next();
                System.out.print("Price  ");
                double price = sc.nextDouble();
                products.add(new Product(name,price)) ;
            } if (ch == 'i'){
                System.out.print("Name  ");
                String name = sc.next();
                System.out.print("Price  ");
                double price = sc.nextDouble();
                System.out.print("Customs Fee  ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name,price,customsFee));

            }if (ch == 'u'){
                System.out.print("Name  ");
                String name = sc.next();
                System.out.print("Price  ");
                double price = sc.nextDouble();
                System.out.println("Manufacture Date  ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name,price,date));

            }

        }
        System.out.println();
        System.out.println("_________________________________________________");
        System.out.println("PRICE TAGS");
        for (Product productList: products) {
            System.out.println(productList.priceTag());

        }

        sc.close();
    }
}
