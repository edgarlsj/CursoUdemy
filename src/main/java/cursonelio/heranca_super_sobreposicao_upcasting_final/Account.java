package cursonelio.heranca_super_sobreposicao_upcasting_final;

public abstract  class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

//    metodo para retirar/casar valores
    public void withdraw (double amount){
        balance -= amount + 5.0;
    }
//   metodo para depositar
    public void deposit (double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
