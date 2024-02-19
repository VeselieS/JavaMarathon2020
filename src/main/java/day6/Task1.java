package JavaMarathone2020.JavaMarathon2020.src.main.java.day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike(1992, "Black", "Harley Davidson");

        car.setYear(1993);
        car.setColor("White");
        car.setModel("Carina");

        car.info();
        System.out.println(car.yearDifference(2000));

        System.out.println();

        motorbike.info();
        System.out.println(motorbike.yearDefference(2000));
    }
}
