package JavaMarathone2020.JavaMarathon2020.src.main.java.day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(MusicArtist member) {
        members.add(member);
    }

    public void removeMember(MusicArtist member) {
        members.remove(member);
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        for (MusicArtist member : musicBandB.getMembers())
            musicBandA.addMember(member);
    }

    public void printMembers() {
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
