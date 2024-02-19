package JavaMarathone2020.JavaMarathon2020.src.main.java.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt() + 1;
        int b = scanner.nextInt() - 1;

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (a <= b) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
                a++;
            }
        }
    }
}
