package cursonelio.exerciciosinterface.segundoexemplo.entities;

import cursonelio.exerciciometodoabstratc.enums.Color;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number; // numero do contrato
    private LocalDate date; // data do contrato
    private Double totalValue; // valor total do contrato



    private List<Installment> installment = new ArrayList<>(); // lista de parcelas

    public void setInstallment(List<Installment> installment) {
        this.installment = installment;
    }


    public Contract(Integer number, LocalDate date, Double totalValue) { // construtor
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallment() {
        return installment;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}