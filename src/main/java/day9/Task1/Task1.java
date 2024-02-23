package JavaMarathone2020.JavaMarathon2020.src.main.java.day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Oleg", "BIN-21-1");
        Teacher teacher = new Teacher("Sergey", "Information Technologies");

        System.out.println("Student group: " + student.group);
        System.out.println("Teacher subject: " + teacher.subject);

        System.out.println();

        student.printInfo();
        System.out.println();

        teacher.printInfo();
        System.out.println();
    }
}
