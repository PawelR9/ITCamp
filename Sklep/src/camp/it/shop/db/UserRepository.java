package camp.it.shop.db;

import camp.it.shop.model.User;
import camp.it.shop.model.UserRoles;

public class UserRepository {

    private User[] users = new User[10];

    private final User admin = new User("admin", "cc12658ecdca17baa9c3a4c0230b2b06", UserRoles.ADMIN);

    public UserRepository() {
        this.users[0] = admin;
    }


    public void addNewUserToDb(String login, String password, String role) {

        User user = new User(login, password, role);

        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i]!=null && this.users[i].getLogin().equals(login)) {
                System.out.println("Given login already exist.");
                return;
            } else if (this.users[i] == null) {
                this.users[i] = user;
                System.out.println("User added correctly.");
                return;
            }
        }
        System.out.println("Add new user impossible. Maximum capacity reached");
    }

    public User findUserByLogin(String login) {
        for (User user : this.users) {
            if (user != null && user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}


