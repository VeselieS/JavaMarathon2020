package JavaMarathone2020.JavaMarathon2020.src.main.java.day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(90, 101);
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina == 0){
            countPlayers--;
        } else {
            stamina -= 1;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static void info() {
        int voidPositions = 6 - countPlayers;
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + voidPositions + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
