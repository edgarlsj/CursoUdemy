package cursonelio.exerciciofixacaoabstratic.entitites;


//classe pessoa fisica
public class Individual extends Person {

    private Double healthExpenditure; //gasto com saude.

    public Individual(String name, Double annualIncome, Double healthExpenditure) {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }


    @Override
    public double tax() {

        if (getAnnualIncome() <= 20000.00) {
             return  (getAnnualIncome() * 0.15) - (healthExpenditure * 0.50);

        } else {
            return (getAnnualIncome() * 0.25) - (healthExpenditure * 0.50);
        }
    }
}
