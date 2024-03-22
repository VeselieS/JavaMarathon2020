package JavaMarathone2020.JavaMarathon2020.src.main.java.day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("MB1", 1990);
        MusicBand musicBand2 = new MusicBand("MB2", 2011);
        MusicBand musicBand3 = new MusicBand("MB3", 2000);
        MusicBand musicBand4 = new MusicBand("MB4", 1993);
        MusicBand musicBand5 = new MusicBand("MB5", 2005);
        MusicBand musicBand6 = new MusicBand("MB6", 1995);
        MusicBand musicBand7 = new MusicBand("MB7", 1996);
        MusicBand musicBand8 = new MusicBand("MB8", 2003);
        MusicBand musicBand9 = new MusicBand("MB9", 1998);
        MusicBand musicBand10 = new MusicBand("MB10", 2003);

        List<MusicBand> list = new ArrayList<>(Arrays.asList(
                musicBand1, musicBand2,
                musicBand3, musicBand4,
                musicBand5, musicBand6,
                musicBand7, musicBand8,
                musicBand9, musicBand10));

        Collections.shuffle(list);

        System.out.println(list);
        System.out.println(groupsAfter2000(list));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                result.add(band);
        }
        return result;
    }
}
