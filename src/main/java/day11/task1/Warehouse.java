package JavaMarathone2020.JavaMarathon2020.src.main.java.day11.task1;

// Склад
public class Warehouse {
    private int countOrder; // Кол-во собранных заказов
    private int balance; // Доход от доставленных заказов

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
