package JavaMarathone2020.JavaMarathon2020.src.main.java.day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10001);

        int max = array[0];
        int min = array[0];
        int countZero = 0;
        int sumCountZero = 0;

        for (int i : array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 10 == 0) {
                countZero++;
                sumCountZero += i;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Количество чисел, оканчиваюшихся на 0: " + countZero);
        System.out.println("Сумма чисел, оканчиваюшихся на 0: " + sumCountZero);
    }
}
