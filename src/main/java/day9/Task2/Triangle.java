package JavaMarathone2020.JavaMarathon2020.src.main.java.day9.Task2;

public class Triangle extends Figure {
    private double lengthSideA;
    private double lengthSideB;
    private double lengthSideC;

    public Triangle(double lengthSideA, double lengthSideB, double lengthSideC, String color) {
        super(color);
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.lengthSideC = lengthSideC;
    }

    @Override
    public double area() {
        double semiPerimeter = perimeter()/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - lengthSideA) * (semiPerimeter - lengthSideB) * (semiPerimeter - lengthSideC));
    }

    @Override
    public double perimeter() {
        return lengthSideA + lengthSideB + lengthSideC;
    }
}
