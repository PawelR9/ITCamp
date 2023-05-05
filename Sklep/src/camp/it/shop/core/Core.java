package camp.it.shop.core;

import camp.it.shop.db.Database;
import camp.it.shop.db.TiresRepository;
import camp.it.shop.model.UserRoles;
import camp.it.shop.gui.GUI;


import java.util.Scanner;

public class Core {

    private static Scanner scanner = new Scanner(System.in);
    private static Session session;

    public static Session getSession() {
        return session;
    }

    public static void start() {

        mainloop:
        while (true) {
            switch (GUI.logOrReg()) {

                case "1":
                    session = Authenticator.authenticate();
                    if (session != null) {
                        menuAfterLogIn();
                    }
                    break;

                case "2":
                    registerNewUser();
                    break;

                case "3":
                    break mainloop;

                default:
                    System.out.println("Wrong choose!!");
                    break;
            }
        }
    }

    private static void menuAfterLogIn() {
        boolean exit = false;
        while (!exit) {
            switch (GUI.showMenu()) {
                case "1":
                    TiresRepository.listTires(Database.getTiresRepository().getTires(session.getLoggedInUser().getRole()), session);
                    break;
                case "2":
                    Database.getTiresRepository().sellTires(scanner);
                    break;
                case "3":
                    exit = true;
                    session = null;
                    break;
                case "4":
                    if (!session.getLoggedInUser().getRole().equals(UserRoles.ADMIN)) {
                        System.out.println("You don't have permission to perform this action");
                    } else {
                        Database.getTiresRepository().addTires(scanner);
                    }
                    break;
                default:
                    System.out.println("Wrong choose!!");
                    break;
            }
        }
    }

    public static void registerNewUser() {
        System.out.println("Enter new login:");
        String login = scanner.nextLine();
        System.out.println("Enter new password:");
        String password = scanner.nextLine();
        String hashedPassword = Authenticator.hashPassword(password);
        String role = UserRoles.USER;

        Database.getUserRepository().addNewUserToDb(login, hashedPassword, role);

        start();

    }
}




