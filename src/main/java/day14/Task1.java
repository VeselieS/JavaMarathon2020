package JavaMarathone2020.JavaMarathon2020.src.main.java.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
//        C:\Users\vadik\Documents\ProgFiles\Java\Student\Example\src\JavaMarathone2020\JavaMarathon2020\src\main\java\day14\numbers.txt
        String path = "C:" + separator + "Users" + separator + "vadik" + separator + "Documents" + separator +
                "ProgFiles" + separator + "Java" + separator + "Student" + separator + "Example" + separator +
                "src" + separator + "JavaMarathone2020" + separator + "JavaMarathon2020" + separator +
                "src" + separator + "main" + separator + "java" + separator + "day14" + separator + "numbers.txt";

        File file = new File(path);

        printSumDigits(file);
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[10];

        int counter = 0;

        for (String number : numbersString)
            numbers[counter++] = Integer.parseInt(number);

        int sum = 0;
        for (int number : numbers)
            sum += number;

        System.out.println(sum);
        scanner.close();
    }
}
