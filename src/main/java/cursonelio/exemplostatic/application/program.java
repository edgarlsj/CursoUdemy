package cursonelio.exemplostatic.application;


import cursonelio.exemplostatic.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        CurrencyConverter currency = new CurrencyConverter();

        System.out.println(" Qual preço do dolar?");
        currency.cotacaoDolar = sc.nextDouble();

        System.out.println("Quantos dolar vc vai comprar?");
        currency.quantidadeDolar = sc.nextDouble();

        double precoPagar = currency.calculoIOF(currency.cotacaoDolar, currency.quantidadeDolar);

        System.out.printf("Quantidade a pagar em reais=   "+ precoPagar);




        sc.close();

    }
}
