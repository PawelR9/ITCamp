import java.util.Random;

public class Zadanie7 {

    /*7.Napisz program, który generuje 30 elementow¹ tablicê (liczby 0 - 100).
    Program powinien wypisywaæ na ekranie wygenerowan¹ tablicê oraz drug¹ najwiêksz¹ liczbê w tablicy.
    Przyk³ad:
            [1,2,3,4,5,6]
            5
            [2,3,6,9,34,35}
            34
            [65,23,76,45,34,12}
            65*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 7 ******");

        Random random = new Random();
        int[] tab = new int[30];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }

        int maxNumber = 0;
        int secondMaxNumber = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = tab[i];
            } else if (tab[i] > secondMaxNumber && tab[i] != maxNumber) {
                secondMaxNumber = tab[i];
            }

        }
        System.out.println();
        System.out.println("Drug¹ najwiêksz¹ liczb¹ w tablicy jest " + secondMaxNumber);


    }
}
