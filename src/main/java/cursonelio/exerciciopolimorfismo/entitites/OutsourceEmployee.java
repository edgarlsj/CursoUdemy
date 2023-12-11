package cursonelio.exerciciopolimorfismo.entitites;

import cursonelio.exerciciopolimorfismo.entitites.Employee;

public class OutsourceEmployee extends Employee {

    private Double additionalChange;

    public OutsourceEmployee(String name, Integer hours, Double valuePerhour, Double additionalChange) {
        super(name, hours, valuePerhour);
        this.additionalChange = additionalChange;
    }

    public OutsourceEmployee() {
        super();
    }

    @Override
    public Double payment() {
        return super.payment() + additionalChange * 1.1;
    }
}
