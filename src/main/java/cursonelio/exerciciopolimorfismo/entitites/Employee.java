package cursonelio.exerciciopolimorfismo.entitites;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerhour;

    public Employee(String name, Integer hours, Double valuePerhour) {
        this.name = name;
        this.hours = hours;
        this.valuePerhour = valuePerhour;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(Double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public Double payment (){
        return hours * valuePerhour;

    }
}
