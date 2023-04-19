package camp.it.bmi.calculator.core;

import camp.it.bmi.calculator.db.Database;
import camp.it.bmi.calculator.logic.BMIcalculator;
import camp.it.bmi.calculator.gui.GUI;


import java.util.Random;
import java.util.Scanner;

public class Core {

    private GUI gui = new GUI();
    private Database database = new Database();

    public void start() {
        boolean run = true;
        do {
            switch (gui.showMenu()) {
                case "1":
                    int id = new Random().nextInt(10000);
                    BMIcalculator BMIcalculator = new BMIcalculator();
                    BMIcalculator.podaj_dane();
                    double BMI = BMIcalculator.oblicz();

                    System.out.println("Twój ID to: " + id);

                    database.addToDb(id, BMI);
                    database.addToHTab(id, BMIcalculator.getHeight());
                    database.addToWTab(id, BMIcalculator.getWeight());

                    break;
                case "2":
                    System.out.println("Podaj swoje id:");
                    Scanner scanner = new Scanner(System.in);
                    int id2 = scanner.nextInt();
                    System.out.println("Twoja waga wynosi " + database.getW(id2) + " kg");
                    System.out.println("Twój wzrost wynosi " + database.getH(id2) + " m");
                    System.out.println("Twoje BMI wynosi: " + database.getDb(id2));

                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong choose!");
                    break;
            }
        } while (run);
    }
}


