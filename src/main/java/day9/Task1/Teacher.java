package JavaMarathone2020.JavaMarathon2020.src.main.java.day9.Task1;

public class Teacher extends Human {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.name);
    }
}
