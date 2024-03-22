package JavaMarathone2020.JavaMarathon2020.src.main.java.day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Andrey Shutski", "Michail Krug"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Nikolay Baskov", "SHAMAN", "Andrey Boyarskiy"));

        MusicBand mb1 = new MusicBand("mb1", 1990, list1);
        MusicBand mb2 = new MusicBand("mb2", 2022, list2);


        System.out.println(mb1);
        System.out.println(mb2);

        mb1.addMember("Yulia Gavrilina");

        MusicBand.transferMembers(mb1, mb2);

        System.out.println();

        System.out.println(mb1);
        System.out.println(mb2);

        System.out.println();

        mb1.printMembers();
        mb2.printMembers();

        mb1.removeMember("Nikolay Baskov");

        System.out.println();
        mb1.printMembers();
    }
}
