package cursonelio.exerciciosinterface.entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime inputDate;
    private LocalDateTime outputDate;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime inputDate, LocalDateTime outputDate, Vehicle vehicle) {
        this.inputDate = inputDate;
        this.outputDate = outputDate;
        this.vehicle = vehicle;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public LocalDateTime getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(LocalDateTime outputDate) {
        this.outputDate = outputDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}