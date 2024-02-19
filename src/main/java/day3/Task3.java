package JavaMarathone2020.JavaMarathon2020.src.main.java.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        int counter = 0;

        while (counter < 5) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(a / b);

            counter++;
        }
    }
}
