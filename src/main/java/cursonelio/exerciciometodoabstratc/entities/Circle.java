package cursonelio.exerciciometodoabstratc.entities;

import cursonelio.exerciciometodoabstratc.enums.Color;

public class Circle extends Shape{


    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
