package camp.it.shop.db;

import camp.it.shop.model.User;
import java.util.*;

public class UserRepository {


    private Map<String, User> users = new HashMap<>();
    private static final UserRepository instance = new UserRepository();

    public void addUser(User user) {
        this.users.put(user.getLogin(), user);
    }

    public void addNewUserToDb(User user) {
        String login = user.getLogin();
        for (User existingUser : this.users.values()) {
            if(existingUser.getLogin().equals(login)) {
                System.out.println("Given login already exists.");
                return;
            }
        }
        this.users.put(user.getLogin(), user);
        System.out.println("User added correctly");
    }

    public User findUserByLogin(String login) {
        return this.users.get(login);
    }

    public Collection<User> getUsers() {
        return this.users.values();
    }

    public static UserRepository getInstance() {
        return instance;
    }
}


