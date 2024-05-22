package cursonelio.exerciciosinterface.segundoexemplo.intefaces;

public interface OnlinePaymentService {

    double paymentFee(double amount); // taxa de pagamento
    double interest(double amount, int months); // juros
}
