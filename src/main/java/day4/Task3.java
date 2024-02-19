package JavaMarathone2020.JavaMarathon2020.src.main.java.day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;

        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }

        int strokeIndex = 0;
        int strokeSum = 0;
        int maxStrokeSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                strokeSum += array[i][j];
            }
            if (strokeSum > maxStrokeSum) {
                maxStrokeSum = strokeSum;
                strokeIndex = i;
            }
            strokeSum = 0;
        }

//        out
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Индекс строки с максимальной суммой: " + strokeIndex);
        System.out.println("Сумма данной строки: " + maxStrokeSum);
    }
}
