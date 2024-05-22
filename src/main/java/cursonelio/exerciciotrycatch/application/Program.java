package cursonelio.exerciciotrycatch.application;

import cursonelio.exerciciotrycatch.Account;
import cursonelio.trycatch.model.exception.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("entre com os dados da conta");
            System.out.print("Numero da conta: ");
            int number = sc.nextInt();
            System.out.print("Nome: ");
            String holder = sc.next();
            System.out.print("Saldo Inicial: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Limite de saque");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number,holder,initialBalance,withdrawLimit);

            System.out.print("Informe a quantidade a sacar:  ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("Novo Saldo "+ account.getBalance());
            System.out.println(account);

        }
        catch (DomainException e){
            System.out.println(e.getMessage());

        }




    }
}
