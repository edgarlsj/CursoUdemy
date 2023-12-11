package cursonelio.polimorfismo;

import cursonelio.heranca_super_sobreposicao_upcasting_final.Account;

//classe de tipo poupança
public class SavingAccount extends Account {
    private Double interestRate; //taxa de juros

    public SavingAccount() {
       super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override // metodo subescrito da superclasse Account
    public void withdraw (double amount){
        balance -= amount;
    }



}
