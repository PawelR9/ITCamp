package camp.it.shop.gui;

import camp.it.shop.core.Core;
import camp.it.shop.model.UserRoles;
import camp.it.shop.model.User;

import java.util.Scanner;

public class GUI {

    private static Scanner scanner = new Scanner(System.in);

    public static String logOrReg() {
        System.out.println("1. Log in");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    public static String showMenu() {
        System.out.println("1. View product list");
        System.out.println("2. Buy the product");
        System.out.println("3. Logout");
        if (Core.getSession() != null && Core.getSession().getLoggedInUser().getRole().equals(UserRoles.ADMIN)) {
            System.out.println("4. Add products");
        }

        return scanner.nextLine();
    }

    public static User readLoginAndPassword() {
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        return new User(login, password, UserRoles.USER);
    }
}
