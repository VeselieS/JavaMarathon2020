package JavaMarathone2020.JavaMarathon2020.src.test.java.Tests.day14;

import JavaMarathone2020.JavaMarathon2020.src.test.java.Tests.AbstractTest;
import JavaMarathone2020.JavaMarathon2020.src.main.java.day14.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

class Day14Task1Test extends AbstractTest {

    @Test
    void sumDigits1() throws FileNotFoundException {
        File file = new File("src/JavaMarathone2020/JavaMarathon2020/src/test/resources/D14T1_1.txt");
        Task1.printSumDigits(file);
        Assertions.assertEquals(10 + System.lineSeparator(), getOutput(), "Файл содержит: 1 1 1 1 1 1 1 1 1 1");
    }

    @Test
    void sumDigits2() throws FileNotFoundException {
        File file = new File("src/JavaMarathone2020/JavaMarathon2020/src/test/resources/D14T1_2.txt");
        Task1.printSumDigits(file);
        Assertions.assertEquals(-10 + System.lineSeparator(), getOutput(), "Файл содержит: -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
    }
}