package JavaMarathone2020.JavaMarathon2020.src.main.java.day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int mark = random.nextInt(2, 6);
        String marks = switch (mark) {
            case 2 -> "Неудовлетворительно";
            case 3 -> "Удовлетворительно";
            case 4 -> "Хорошо";
            case 5 -> "Отлично";
            default -> "";
        };

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + marks.toLowerCase());
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
