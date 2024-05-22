package cursonelio.exerciciosinterface.segundoexemplo.application;
import cursonelio.exerciciosinterface.segundoexemplo.entities.Contract;
import cursonelio.exerciciosinterface.segundoexemplo.entities.Installment;
import cursonelio.exerciciosinterface.segundoexemplo.intefaces.OnlinePaymentService;
import cursonelio.exerciciosinterface.segundoexemplo.service.ContractService;
import cursonelio.exerciciosinterface.segundoexemplo.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");// formato da data

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date= LocalDate.parse(sc.next(), fmt);// convertendo a data para o formato especificado
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);// instanciando um contrato



        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();


        ContractService contractService = new ContractService(new PaypalService()); // instanciando um contrato (injeção de dependencia)




        contractService.processContract(obj,months); // processando o contrato


        System.out.println("Parcelas:  ");
        for (Installment installment: obj.getInstallment()) {// percorrendo a lista de parcelas
            System.out.println(installment);

        }


        sc.close();

    }
}
