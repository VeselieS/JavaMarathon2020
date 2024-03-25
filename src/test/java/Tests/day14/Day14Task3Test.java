package JavaMarathone2020.JavaMarathon2020.src.test.java.Tests.day14;

import JavaMarathone2020.JavaMarathon2020.src.test.java.Tests.AbstractTest;
import JavaMarathone2020.JavaMarathon2020.src.main.java.day14.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class Day14Task3Test extends AbstractTest {

    @Test
    void normal() throws Exception {
        File file = new File("src/JavaMarathone2020/JavaMarathon2020/src/test/resources/D14T2_1.txt");
        Assertions.assertEquals("[{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]",
                Task3.parseFileToObjList(file).toString(),
                "Файл содержит строки: \nMike 24\nJohn 19\nAnna 20\nMiguel 5");
    }

    @Test
    void negativeAge() throws Exception {
        File file = new File("src/JavaMarathone2020/JavaMarathon2020/src/test/resources/D14T2_2.txt");
        Task3.parseFileToObjList(file);
        Assertions.assertEquals("Некорректный входной файл" + System.lineSeparator(), getOutput(),
                "В файле содержится отрицательный возраст");
    }

    @Test
    void fileNotFound() throws Exception {
        File file = new File("src/JavaMarathone2020/JavaMarathon2020/src/test/resources/D14T2_miss.txt");
        Task3.parseFileToObjList(file);
        Assertions.assertEquals("Файл не найден" + System.lineSeparator(), getOutput(),
                "Попытка обратиться к файлу, которого нет");
    }

}