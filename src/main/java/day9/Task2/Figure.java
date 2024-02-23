package JavaMarathone2020.JavaMarathon2020.src.main.java.day9.Task2;

public abstract class Figure {
    String color;

    public abstract double area();

    public abstract double perimeter();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
