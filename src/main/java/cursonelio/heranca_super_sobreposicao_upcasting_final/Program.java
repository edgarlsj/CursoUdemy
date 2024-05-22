package cursonelio.heranca_super_sobreposicao_upcasting_final;

public class Program {
    public static void main(String[] args) {

//        Account acc = new Account(1001, "Edgar", 0.0);
//        BusinessAccount bacc = new BusinessAccount(1001, "Viviane", 0.0, 500.0);

//        UPCASTING : ocorre quando você atribui uma instância de uma Subclasse a uma variável de referência da Superclasse.
//        Isso é seguro porque a subclasse herda todos os membros da superclasse.

//        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.);
        Account acc3 = new SavingAccount(1004, "Lucas", 0.0, 0.01);

//        DOWNCASTING O downcasting ocorre quando você converte uma referência de superclasse de volta para uma referência de subclasse

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);


//     instanceof em Java é um operador utilizado para testar se um objeto é uma instância de uma determinada classe,
//     interface ou de uma classe que implementa uma determinada interface. Ele retorna true se o objeto for uma
//     instância da classe ou interface especificada, e false caso contrário.
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }




    }


}
