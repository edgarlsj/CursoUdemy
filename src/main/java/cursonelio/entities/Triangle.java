package cursonelio.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;


    public double calculoArea (){
        double s = (a + b + c) / 2.0; // Calcula o semiperímetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Calcula a área usando a fórmula de Heron

    }



}
