import java.util.Random;

public class Zadanie5 {

    /*5.Napisz program który generuje 10 elementow¹ tablicê liczb (0 - 100) a nastêpnie przesuwa t¹ tablicê
        o 3 elementy w prawo. Program ma wypisywaæ na ekranie pierwotn¹ oraz przesuniêt¹ tablicê. Przyk³ad:
            [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
            [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 5 ******");

        int[] tab = new int[10];
        Random random = new Random();

        System.out.println("Pierwotna tablica:");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }

        int[] temp = new int[3];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = tab[tab.length - 3 + i];
        }

        for (int i = tab.length - 4; i >= 0; i--) {
            tab[i + 3] = tab[i];
        }

        for (int i = 0; i < temp.length; i++) {
            tab[i] = temp[i];
        }

        System.out.println();
        System.out.println("Tablica po przesuniêciu o 3 pozycje w prawo: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
