package cursonelio.conta;

import cursonelio.conta.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Account account; //declarou a variavel account da classe Account

        System.out.printf("Enter account number");
        int number = sc.nextInt();

        System.out.println("Enter account holder:");
        String holder = sc.next();


        System.out.println("Is there na initial deposit (y/n)?");
        char resp = sc.next().charAt(0);



        if (resp == 'y' || resp == 'Y'){
            System.out.println("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit); //sobrecarga com objetos e construtores
        }else {
            account = new Account(number, holder); //sobrecarga outro contrutor.
        }

        System.out.println("-------------------------------------------------");
        System.out.println("account data");
        System.out.println(account);

        System.out.println("Enter a deposit value");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("-------------------------------------------------");
        System.out.println("update account data");
        System.out.println(account);


        System.out.println("Enter a withdraw value");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("update account data");
        System.out.println(account);











        sc.close();
    }

}
