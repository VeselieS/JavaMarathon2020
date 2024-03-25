package JavaMarathone2020.JavaMarathon2020.src.main.java.day14;

public class Person {
    private String name;
    private int year;

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
