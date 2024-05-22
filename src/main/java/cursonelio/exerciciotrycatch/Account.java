package cursonelio.exerciciotrycatch;

import cursonelio.trycatch.model.exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
//metodo que valida e depois realiza o saque
    public void withdraw(double amount){
        validateWithdraw(amount);
        balance -= amount;
    }
//esse metodo faz a validação do saque
    private void validateWithdraw(double amount) throws DomainException {
        if (amount > getBalance()) {
            throw new DomainException("Saldo insuficiente para saque");
        }
        if (amount > getWithdrawLimit()) {
            throw new DomainException("Valor de saque excede o limite de saque da conta");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}

