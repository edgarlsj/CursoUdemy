package cursonelio.polimorfismo;

import cursonelio.heranca_super_sobreposicao_upcasting_final.Account;

public class BusinessAccount extends Account {

    private Double loanLimit;



    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount < loanLimit) {
           balance += amount - 10.0;
        }
    }
    @Override
    public void withdraw (double amount){
        super.withdraw(amount); //usamos para acessar membros (métodos, variáveis) da superclasse (classe pai) dentro de uma subclasse
        balance -= 2.0;
    }
}
