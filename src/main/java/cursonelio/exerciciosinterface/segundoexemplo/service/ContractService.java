package cursonelio.exerciciosinterface.segundoexemplo.service;

import cursonelio.exerciciosinterface.segundoexemplo.entities.Contract;
import cursonelio.exerciciosinterface.segundoexemplo.entities.Installment;
import cursonelio.exerciciosinterface.segundoexemplo.intefaces.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public ContractService() {
    }

    public void processContract(Contract contract, int mouths){ // processando o contrato

        double basicQuota = contract.getTotalValue() / mouths; // valor das parcelas

        for (int i = 1; i <= mouths; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallment().add(new Installment(dueDate, quota));
        }


        }
    }




