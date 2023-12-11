package cursonelio.exemplostatic.util;

public class CurrencyConverter {

    public static double IOF = 0.06;
    public double cotacaoDolar;
    public double quantidadeDolar;





    public static double calculoIOF (double cotacaoDolar, double quantidadeDolar){
       double valorDolar =  cotacaoDolar * quantidadeDolar;
       double valorIOF =  valorDolar * IOF ;
       return valorIOF + valorDolar;




    }
}




