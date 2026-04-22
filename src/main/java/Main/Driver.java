package Main;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    private List<User> users;

    public Driver() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int index) {
        if (validIndex(index, users)) {
            users.remove(index);
        }
    }

    public User getUser(int index) {
        return validIndex(index, users) ? users.get(index) : null;
    }

    public void replaceUser(int index, User user) {
        if (validIndex(index, users)) {
            users.set(index, user);
        }
    }

    public int userCount() {
        return users.size();
    }

    public static boolean validIndex(int index, List<?> list) {
        return index >= 0 && index < list.size();
    }
}