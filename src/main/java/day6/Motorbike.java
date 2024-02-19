package JavaMarathone2020.JavaMarathon2020.src.main.java.day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDefference(int yearI) {
        return yearI - year;
    }

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
