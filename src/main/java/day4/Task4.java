package JavaMarathone2020.JavaMarathon2020.src.main.java.day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10001);

        int sum = 0;
        int sumMax = 0;
        int index = 0;
        for (int i = 2; i < array.length; i++) {
            sum += array[i-2] + array[i-1] + array[i];
            if (sum > sumMax) {
                sumMax = sum;
                index = i-2;
            }
        }
        System.out.println("MaxSum: " + sumMax);
        System.out.println("Index: " + index);
    }
}
