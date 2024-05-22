package cursonelio.exerciciofixacaoabstratic.entitites;

public abstract class Person {

    private String name;
    private Double annualIncome; //renda anual

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public abstract double tax();

}
