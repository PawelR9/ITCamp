package camp.it.shop.core;

import camp.it.shop.db.UserRepository;
import camp.it.shop.gui.GUI;
import camp.it.shop.model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class Authenticator {

    private static final Authenticator instance = new Authenticator();
    private final GUI gui = GUI.getInstance();
    private final UserRepository userRepository = UserRepository.getInstance();

    private final String seed = "Gfdlas84Hfas*dsa&fs^gasdfg*fs8";

    public Session authenticate() {
        int counter = 0;
        while (counter < 3) {

            User userFromGui = gui.readLoginAndPassword();
            User userFromDb = userRepository.findUserByLogin(userFromGui.getLogin());
            if (userFromDb != null &&
                    userFromDb.getPassword().equals(
                            DigestUtils.md5Hex(userFromGui.getPassword() + seed))) {
                return new Session(userFromDb);
            }

            System.out.println("Incorrect login or password !!");
            counter++;
        }

        return null;
    }

    public String hashPassword (String password) {
       return  DigestUtils.md5Hex(password + seed);
    }

    public static Authenticator getInstance() {
        return instance;
    }

}
