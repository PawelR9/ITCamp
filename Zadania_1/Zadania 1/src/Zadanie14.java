import java.util.Random;

public class Zadanie14 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie14 *****");

        /*14.Napisz program kt�ry generuje tablic� liczb 0 i 1 (10 element�w). Program ma sprawdzi� czy tablica
        jest symetryczna - pierwszy element taki jak ostatni, drugi taki jak przedostatni itd. Wynikiem dzia�ania
        programu ma by� wypisana wygenerowana tablica oraz true albo false w zale�no�ci czy jest symetria czy nie.*/


        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2);
            System.out.print(tab[i] + " ");
        }

        boolean isSymmetric = true;
        int lastIndex = tab.length - 1;

        for (int i = 0; i < tab.length / 2; i++) {
            if (tab[i] != tab[lastIndex - i]) {
                isSymmetric = false;
                break;
            }
        }

        System.out.println();

        if (isSymmetric) {
            System.out.println("True - tablica jest symetryczna.");
        } else {
            System.out.println("False - tablica nie jest symetryczna.");
        }


    }
}
