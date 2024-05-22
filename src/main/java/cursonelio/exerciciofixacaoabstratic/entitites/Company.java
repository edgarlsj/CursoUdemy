package cursonelio.exerciciofixacaoabstratic.entitites;

public class Company extends Person{

    private Integer numberEmployees;


    public Company(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Company(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
        double tax;

        if (numberEmployees <= 10){
            return (getAnnualIncome() * 0.16);
        }else {
            return (getAnnualIncome() * 0.14);
        }
    }
}
