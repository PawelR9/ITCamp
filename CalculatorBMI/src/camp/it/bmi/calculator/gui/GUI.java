package camp.it.bmi.calculator.gui;
import java.util.Scanner;

public class GUI {

    Scanner scanner = new Scanner(System.in);

    public String showMenu() {

        System.out.println("1. Oblicz BMI");
        System.out.println("2. Przypomnij BMI");
        System.out.println("3. Exit");

        return scanner.next();
    }


}




