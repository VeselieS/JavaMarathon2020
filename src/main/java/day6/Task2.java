package JavaMarathone2020.JavaMarathon2020.src.main.java.day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 1990, 23.0, 45.5);

        airplane.setYear(1992);
        airplane.setLength(22.0);

        airplane.fillUp(500.0);
        airplane.fillUp(350.0);

        airplane.info();
    }
}
