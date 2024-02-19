package JavaMarathone2020.JavaMarathon2020.src.main.java.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        if (level > 0) {
            if (level <= 4) System.out.println("Малоэтажный дом");
            if (level >= 5 && level <= 8) System.out.println("Среднеэтажный дом");
            if (level >= 9) System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }
}
