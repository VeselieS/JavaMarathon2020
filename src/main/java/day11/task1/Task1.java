package JavaMarathone2020.JavaMarathon2020.src.main.java.day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 0; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println(warehouse + " " + picker + " " + courier);

        picker.bonus();
        courier.bonus();

        System.out.println(warehouse + " " + picker + " " + courier);
    }
}
