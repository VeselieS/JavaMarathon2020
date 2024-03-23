package JavaMarathone2020.JavaMarathon2020.src.main.java.day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return getSubscriptions().contains(user);
    }

//    Если пользователи подписаны друг на друга
    public boolean isFriend(User user) {
        return getSubscriptions().contains(user) && user.getSubscriptions().contains(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
