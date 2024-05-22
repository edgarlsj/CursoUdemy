package cursonelio.exerciciosinterface.domain.service;

import cursonelio.exerciciosinterface.entities.CarRental;
import cursonelio.exerciciosinterface.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHours;
    private TaxServices taxServices;


    public RentalService(Double pricePerDay, Double pricePerHours, TaxServices taxServices) {
        this.pricePerDay = pricePerDay;
        this.pricePerHours = pricePerHours;
        this.taxServices = taxServices;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHours() {
        return pricePerHours;
    }

    public void setPricePerHours(Double pricePerHours) {
        this.pricePerHours = pricePerHours;
    }




    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getInputDate(), carRental.getOutputDate()).toMinutes();
        double hours = minutes / 60.0;
        long day = Duration.between(carRental.getInputDate(), carRental.getOutputDate()).toDays();

        double basicPayment;

        if (hours <= 12.0) {

            basicPayment = pricePerHours * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);

        }

        double tax = taxServices.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));


    }


}
