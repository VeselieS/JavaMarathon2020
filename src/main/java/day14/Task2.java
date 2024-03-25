package JavaMarathone2020.JavaMarathon2020.src.main.java.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "src" + separator + "JavaMarathone2020" + separator + "JavaMarathon2020" + separator + "src" + separator +
                "main" + separator + "java" + separator + "day14" + separator + "people.txt";

        File file = new File(path);


        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line;
            List<String> peoples = new ArrayList<>();

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                peoples.add(line);
            }


            for (String people : peoples) {
                if (Integer.parseInt(people.split(" ")[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                    }
                }
            }

            return peoples;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        }

    }
}
