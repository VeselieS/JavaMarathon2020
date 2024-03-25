package JavaMarathone2020.JavaMarathon2020.src.main.java.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        String separator = File.separator;
        String path = "src" + separator + "JavaMarathone2020" + separator + "JavaMarathon2020" + separator +
                "src" + separator + "main" + separator + "java" + separator + "day14" + separator + "people.txt";

        File file = new File(path);

        List<Person> persons = null;
        try {
            persons = parseFileToObjList(file);
            System.out.println(persons);
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> persons = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            String line;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (Integer.parseInt(line.split(" ")[1]) < 0) {
                    System.out.println("Некорректный входной файл");
                    return null;
                } else {
                    Person person = new Person();
                    person.setName(line.split(" ")[0]);
                    person.setYear(Integer.parseInt(line.split(" ")[1]));
                    persons.add(person);
                }
            }
            return persons;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        }
    }
}
