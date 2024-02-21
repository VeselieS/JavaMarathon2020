package JavaMarathone2020.JavaMarathon2020.src.main.java.day8;

public class Task1 {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i <= 20000; i++) {
            String letter = Integer.toString(i);
            str += letter + " ";
        }
        System.out.println("Время выполнения обычного класса String: " + (System.currentTimeMillis() - time) + " миллисекунд");

        time = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            String letter = Integer.toString(i);
            stringBuilder.append(letter).append(" ");
        }
        System.out.println(stringBuilder);
        System.out.println("Время выполнения класса StringBuilder: " + (System.currentTimeMillis() - time) + " миллисекунд");

    }
}
