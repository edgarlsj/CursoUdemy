package cursonelio.polimorfismo;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1020, "edgar", 1000.0);
//        Account y = new SavingAccount(1021, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);


        System.out.println(x.getBalance());


    }
}
