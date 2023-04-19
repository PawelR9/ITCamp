package camp.it.bmi.calculator.logic;

import java.util.Scanner;

public class BMIcalculator {

    private double weight;
    private double height;


    public void podaj_dane() {
        System.out.println("Podaj wzrost w cm: ");
        Scanner in = new Scanner(System.in);
        height = in.nextDouble() / 100;

        System.out.println("Podaj wagê w kg: ");
        weight = in.nextDouble();
    }

    public double oblicz() {
        double BMI = weight / (height * height);
        System.out.println("Twoje BMI wynosi: " + BMI);


        if (BMI > 24.9) {
            System.out.println("Nadwaga");
        } else if (BMI < 18.5) {
            System.out.println("Niedowaga");
        } else {
            System.out.println("W normie");
        }
        return BMI;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

