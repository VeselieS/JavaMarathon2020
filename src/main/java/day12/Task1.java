package JavaMarathone2020.JavaMarathon2020.src.main.java.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("Volvo");
        list.add("BMW");
        list.add("Nissan");
        list.add("Ferrari");

        System.out.println(list);

        list.add(2, "Man");

        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
