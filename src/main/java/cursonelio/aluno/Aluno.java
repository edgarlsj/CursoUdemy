package cursonelio.aluno;

public class Aluno {

    private String nome;
    private double n1, n2, n3;

    public double calculoNotas() {
        return n1 + n2 + n3;

    }


    public double faltaPontos() {
        if (calculoNotas() < 60.0) {
            return 60.0 - calculoNotas();
        } else {
            return 0.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
}
