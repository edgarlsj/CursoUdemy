package cursonelio.exerciciosinterface.application;

import cursonelio.exerciciosinterface.entities.CarRental;
import cursonelio.exerciciosinterface.entities.Vehicle;
import cursonelio.exerciciosinterface.domain.service.BrazilTaxService;
import cursonelio.exerciciosinterface.domain.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //criado objeto para formatação da data e hora

        System.out.println("Entre com os dados do aluguel ");
        System.out.print("Modelo do carro: ");
        String modelCar = scanner.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm) ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm) ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(modelCar) ); //construtor passando os argumentos

        System.out.print("Entre com o preço por hora: ");
        double pricePerHours = scanner.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHours, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        scanner.close();
    }
}
