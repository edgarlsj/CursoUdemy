package cursonelio.exerciciosinterface.entities;

public class Vehicle {

    private String model;

    public Vehicle(String model, CarRental order) {
        this.model = model;
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
