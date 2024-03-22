package JavaMarathone2020.JavaMarathon2020.src.main.java.day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist ma1 = new MusicArtist("Vasya", 33);
        MusicArtist ma2 = new MusicArtist("Olya", 52);
        MusicArtist ma3 = new MusicArtist("Petya", 28);

        MusicBand mb1 = new MusicBand("MB1", 2015, Arrays.asList(ma1, ma2));
        MusicBand mb2 = new MusicBand("MB2", 2019);

        mb2.addMember(ma3);

        System.out.println(mb1);
        System.out.println(mb2);
        System.out.println();

        MusicBand.transferMembers(mb2, mb1);
        System.out.println(mb1);
        System.out.println(mb2);
    }
}
