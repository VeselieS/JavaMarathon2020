package JavaMarathone2020.JavaMarathon2020.src.main.java.day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(1996, "Red", "Ducati");
        Motorbike motorbike2 = new Motorbike(1992, "Black", "Harley Davidson");
        Motorbike motorbike3 = new Motorbike(1960, "Green", "Ural");
        Motorbike motorbike4 = new Motorbike(1938, "Blue", "BMW");

        System.out.println("Motorbike1: " + motorbike1.getYear() + " " + motorbike1.getColor() + " " + motorbike1.getModel());
        System.out.println("Motorbike2: " + motorbike2.getYear() + " " + motorbike2.getColor() + " " + motorbike2.getModel());
        System.out.println("Motorbike3: " + motorbike3.getYear() + " " + motorbike3.getColor() + " " + motorbike3.getModel());
        System.out.println("Motorbike4: " + motorbike4.getYear() + " " + motorbike4.getColor() + " " + motorbike4.getModel());
    }
}
