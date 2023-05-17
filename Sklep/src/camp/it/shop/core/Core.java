package camp.it.shop.core;

import camp.it.shop.db.FileLoader;
import camp.it.shop.db.TiresRepository;
import camp.it.shop.db.UserRepository;
import camp.it.shop.model.Tires;
import camp.it.shop.model.User;
import camp.it.shop.model.UserRoles;
import camp.it.shop.gui.GUI;

import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;

public class Core {

    private static final Core instance = new Core();
    private Scanner scanner = new Scanner(System.in);

    private final FileLoader fileLoader = FileLoader.getInstance();
    private final Authenticator authenticator = Authenticator.getInstance();
    private final TiresRepository tiresRepository = TiresRepository.getInstance();
    private final UserRepository userRepository = UserRepository.getInstance();
    private final GUI gui = GUI.getInstance();
    private Session session;

    public Session getSession() {
        return session;
    }


    public void start() {
        try {
            fileLoader.readDataFromFile();
        } catch (IOException e) {
            System.out.println("Database is malformed!");
            return;
        }
        while (true) {

            switch (gui.logOrReg()) {

                case "1":
                    session = authenticator.authenticate();
                    if (session != null) {
                        menuAfterLogIn();
                    }
                    break;

                case "2":
                    registerNewUser();
                    break;

                case "3":
                    try {
                        fileLoader.saveDataToFile();
                        return;
                    } catch (IOException e) {
                        System.out.println("Database Error !!");
                    }
                    break;
                default:
                    System.out.println("Wrong choose!!");
                    break;
            }
        }
    }

    private void menuAfterLogIn() {
        boolean exit = false;

        do {
            switch (gui.showMenu()) {
                case "1":
                    String role = session.getLoggedInUser().getRole();
                    Collection<Tires> tiresList = tiresRepository.getTires(role);
                    tiresRepository.listTires(tiresList, session);
                    break;
                case "2":
                    tiresRepository.sellTires(scanner);
                    break;
                case "3":
                    exit = true;
                    session = null;
                    break;
                case "4":
                    if (!session.getLoggedInUser().getRole().equals(UserRoles.ADMIN)) {
                        System.out.println("You don't have permission to perform this action");
                    } else {
                        tiresRepository.addTiresToTheStock(scanner);
                    }
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        } while (!exit);
    }

    public void registerNewUser() {
        System.out.println("Enter a new login:");
        String login = scanner.nextLine();
        System.out.println("Enter a new password:");
        String password = scanner.nextLine();
        String hashedPassword = authenticator.hashPassword(password);
        String role = UserRoles.USER;

        userRepository.addNewUserToDb(new User(login, hashedPassword, role));
    }

    public static Core getInstance() {
        return instance;
    }
}
