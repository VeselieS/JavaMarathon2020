package JavaMarathone2020.JavaMarathon2020.src.main.java.day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();
        int[] array = new int[n];

        int arrayLength;
        int quantityMoreEight = 0;
        int quantityEqualOne = 0;
        int numbEven = 0;
        int numbOdd = 0;
        int sumAllElements = 0;

        for (int i = 0; i < n; i++)
            array[i] = random.nextInt(11);

        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

        arrayLength = array.length;

        for (int i : array) {
            if (i > 8) quantityMoreEight++;
            if (i == 1) quantityEqualOne++;
            if (i % 2 == 0) numbEven++;
            if (i % 2 != 0) numbOdd++;
            sumAllElements += i;
        }

        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + quantityMoreEight);
        System.out.println("Количество чисел равных 1: " + quantityEqualOne);
        System.out.println("Количество четных чисел: " + numbEven);
        System.out.println("Количество нечетных чисел: " + numbOdd);
        System.out.println("Сумме всех элементов массива: " + sumAllElements);
    }
}
