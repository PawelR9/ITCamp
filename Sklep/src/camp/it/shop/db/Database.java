package camp.it.shop.db;

public class Database {

    private static UserRepository userRepository = new UserRepository();

    private static TiresRepository tiresRepository = new TiresRepository();


    public static UserRepository getUserRepository() {
        return userRepository;
    }

    public static TiresRepository getTiresRepository() {
        return tiresRepository;
    }

}
