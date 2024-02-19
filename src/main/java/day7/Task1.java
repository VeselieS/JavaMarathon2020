package JavaMarathone2020.JavaMarathon2020.src.main.java.day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 1923, 24.0, 25.0);
        Airplane airplane2 = new Airplane("S7", 1934, 55.0, 67.0);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}