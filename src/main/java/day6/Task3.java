package JavaMarathone2020.JavaMarathon2020.src.main.java.day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Ivan");
        Teacher teacher = new Teacher("Olga", "Russian language");

        teacher.evaluate(student);
    }
}
