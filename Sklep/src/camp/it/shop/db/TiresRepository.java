package camp.it.shop.db;


import camp.it.shop.core.Session;
import camp.it.shop.model.Tires;
import camp.it.shop.model.UserRoles;


import java.util.Scanner;

public class TiresRepository {


    private final Tires[] tires = new Tires[10];


    public TiresRepository() {
        this.tires[0] = new Tires("Continental", "PremiumContact 7", "summer", "205/55/16",
                2023, 408, 12, "1001");
        this.tires[1] = new Tires("Continental", "Winter Contact TS 870", "winter", "225/45/17",
                2022, 662, 8, "1002");
        this.tires[2] = new Tires("Goodyear", "Eagle F1 Asymmetric 5", "summer", "225/45/17",
                2023, 455, 2, "2001");
        this.tires[3] = new Tires("Goodyear", "Ultra Grip 9+", "winter", "205/55/16",
                2022, 474, 6, "2002");
        this.tires[4] = new Tires("Pirelli", "P7 Cinturato", "summer", "225/45/17",
                2023, 500, 1, "3001");
        this.tires[5] = new Tires("Pirelli", "P Zero", "summer", "225/45/18",
                2023, 649, 16, "3002");
        this.tires[6] = new Tires("Pirelli", "SottoZero 2", "winter", "235/40/18",
                2023, 738, 4, "3003");
        this.tires[7] = new Tires("Michelin", "Primacy 4+", "summer", "225/45/18",
                2023, 733, 20, "4001");
        this.tires[8] = new Tires("Bridgestone", "Turanza 6", "summer", "235/40/18",
                2023, 688, 24, "5001");
        this.tires[9] = new Tires("Bridgestone", "Blizzak LM005", "winter", "215/40/17",
                2022, 827, 3, "5002");
    }

    public Tires[] getTires(String role) {
        return tires;
    }

    public void sellTires(Scanner scanner) {
        System.out.println("Enter the product code:");
        String productCode = scanner.nextLine();
        for (Tires tires : this.tires) {
            if (tires.getQuantity() != 0 && tires.getProductCode().equals(productCode)) {
                System.out.println("Enter quantity you wan buy:");
                String quantityStr = scanner.nextLine();
                int quantity = Integer.parseInt(quantityStr);
                if (quantity > tires.getQuantity()) {
                    System.out.println("Sorry, not enough tires in the stock. You can buy maximum " + tires.getQuantity());
                } else {
                    tires.setQuantity(tires.getQuantity() - quantity);
                    System.out.println("Great, you bought " + quantity + " tires.");
                    System.out.println("The price of your purchase is: " + quantity * tires.getPrice());

                }
            }
        }
    }

    public void addTires(Scanner scanner) {
        System.out.println("Enter the product code:");
        String productCode = scanner.nextLine();
        for (Tires tires : this.tires) {
            if (tires.getProductCode().equals(productCode)) {
                System.out.println("Enter quantity you want add:");
                String quantityStr = scanner.nextLine();
                int quantity = Integer.parseInt(quantityStr);
                tires.setQuantity(tires.getQuantity() + quantity);
                System.out.println("You added " + quantity + " tires. Now in the stock there is " + tires.getQuantity());
            }
        }
    }

    public static void listTires(Tires[] tires, Session loggedInUser) {
        for (Tires tire : tires) {
            if (loggedInUser.getLoggedInUser().getRole().equals(UserRoles.USER) && tire.getQuantity()!= 0) {
                System.out.println(tire);
            } else if (loggedInUser.getLoggedInUser().getRole().equals(UserRoles.ADMIN)){
                System.out.println(tire);
            }
        }
    }

}








