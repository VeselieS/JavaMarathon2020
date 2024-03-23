package JavaMarathone2020.JavaMarathon2020.src.main.java.day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Vasya");
        User user2 = new User("Olga");
        User user3 = new User("Oleg");

        user1.sendMessage(user2, "Зравствуй, дорогая!");
        user1.sendMessage(user2, "Как ты? Давно не слышал твой голос!");

        user2.sendMessage(user1, "Приветики!");
        user2.sendMessage(user1, "У меня все прекрасно");
        user2.sendMessage(user1, "Я тоже очень скучаю :(");

        user3.sendMessage(user1, "Дарова, Кабан!");
        user3.sendMessage(user1, "Че ты там куда пропал. Два месяца ни слуху, ни духу!");
        user3.sendMessage(user1, "Подтягивайся вечерком к пацанам, увидимся");

        user1.sendMessage(user3, "Здарова, и вправду давно не видились");
        user1.sendMessage(user3, "Я бы с радостью, но я сегодня со своей буду");
        user1.sendMessage(user3, "Спасибо что позвал");

        user3.sendMessage(user1, "Вася, ты каблук!");

        MessageDatabase.showDialog(user1, user3);
    }
}
