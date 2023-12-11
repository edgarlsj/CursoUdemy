package cursonelio.listexample.employee;

public class Employee {

    private String name;
    private Double salary;
    private  Integer id;

    public Employee(String name, Double salary, Integer id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void increaseSalary (double percentage){
        salary += salary * percentage /100;
    }

    @Override
    public String toString() {
        return id
                +","
                + name
                + ","
                + salary;
    }
}
