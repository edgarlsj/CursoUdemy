package cursonelio.exerciciosinterface.segundoexemplo.service;

import cursonelio.exerciciosinterface.segundoexemplo.intefaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService { //classe do calculo das taxas do service da paypal

    private final Double INTEREST_SIMPLE = 0.02;//2%
    private final Double TAX_PAYMENT = 0.01; //1%


    @Override
    public double paymentFee(double amount) { //metodo de taxa de pagamento
        return amount * INTEREST_SIMPLE;
    }

    @Override
    public double interest(double amount, int months) { // metodo de calculo do juros

        double result = TAX_PAYMENT * months;

        return amount * result;
    }
}
