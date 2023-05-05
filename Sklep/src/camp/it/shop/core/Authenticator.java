package camp.it.shop.core;

import camp.it.shop.db.Database;
import camp.it.shop.gui.GUI;
import camp.it.shop.model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class Authenticator {


    private static final String seed = "Gfdlas84Hfas*dsa&fs^gasdfg*fs8";

    public static Session authenticate() {
        int counter = 0;
        while (counter < 3) {
            User userFromGui = GUI.readLoginAndPassword();
            User userFromDb = Database.getUserRepository().findUserByLogin(userFromGui.getLogin());
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


    public static String hashPassword (String password) {
        String passwordAfterHash = DigestUtils.md5Hex(password + seed);
        return  passwordAfterHash;
    }

}
