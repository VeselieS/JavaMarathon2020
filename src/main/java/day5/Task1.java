package JavaMarathone2020.JavaMarathon2020.src.main.java.day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        car.setYear(1993);
        car.setColor("White");
        car.setModel("Carina");

        car1.setYear(1991);
        car1.setColor("Brown");
        car1.setModel("Crown");

        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());

        System.out.println();

        System.out.println(car1.getYear());
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
    }
}
