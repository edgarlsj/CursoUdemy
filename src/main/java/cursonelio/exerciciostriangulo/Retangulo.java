package cursonelio.exerciciostriangulo;

public class Retangulo {

    private double width; //largura
    private double height; //altura

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2* (width + height );


    }
    public double diagonal (){
        return Math.sqrt(height * height + width * width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
