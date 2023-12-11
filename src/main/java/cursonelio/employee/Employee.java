package cursonelio.employee;

public class Employee {

    private String name;
    private double salary;
    private double tax;


    public double netSalary (){
       return  salary - tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", tax=" + tax +
                '}';
    }

    public void increaseSalary(double percentage){
        double aumento = salary * (percentage /100);
        salary += aumento;



    }
}
