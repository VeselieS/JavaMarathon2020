package JavaMarathone2020.JavaMarathon2020.src.test.java.Tests.day2;

import JavaMarathone2020.JavaMarathon2020.src.test.java.Tests.AbstractTest;
import JavaMarathone2020.JavaMarathon2020.src.main.java.day2.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day2Task4Test extends AbstractTest {
    @Test
    public void Five() {
        setInput("5");
        Task4.main(new String[0]);
        assertEquals("1.25" + System.lineSeparator(), getOutput(), "Введено 5");
    }

    @Test
    public void MinusThree() {
        setInput("-3");
        Task4.main(new String[0]);
        assertEquals("420.0" + System.lineSeparator(), getOutput(), "Введено -3");
    }

    @Test
    public void MinusTwo() {
        setInput("-2");
        Task4.main(new String[0]);
        assertEquals("2.0" + System.lineSeparator(), getOutput(), "Введено -2");
    }

    @Test
    public void Nine() {
        setInput("9");
        Task4.main(new String[0]);
        assertEquals("4.4375" + System.lineSeparator(), getOutput(), "Введено 9");
    }
}