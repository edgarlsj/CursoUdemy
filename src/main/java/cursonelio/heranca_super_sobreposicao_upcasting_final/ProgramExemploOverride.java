package cursonelio.heranca_super_sobreposicao_upcasting_final;

public class ProgramExemploOverride {
    public static void main(String[] args) {

//        Account acc1 = new Account(1001, "Edgar", 1000.0);
//        acc1.withdraw(200.0);
//        System.out.println(acc1);

//        Chama o método sobrescrito na classe SavingAccount
        Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2);


//        fazendo Upcasting de Account recebendo os atributos de BusinessAccount e aproveitando o super
        Account acc3 = new BusinessAccount(1003, "Isaque", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3);





    }
}
