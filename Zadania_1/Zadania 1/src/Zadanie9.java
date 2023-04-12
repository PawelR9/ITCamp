import java.util.Random;

public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 9 *****");

        /*9.Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
        Wynikiem dzia³ania programu maj¹ byæ wypisane obie tablice, oraz trzecia tablica,
        w które ka¿dy element jest sum¹ odpowiadaj¹cych elementów z dwóch pierwszych tablic. Przyk³ad:
        1 4 4 64 45
        23 32 5 23 3
        24 36 9 87 48*/

        int[] tab = new int[10];
        int[] tab2 = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            tab2[i] = random.nextInt(101);
        }
        System.out.println("Pierwsza tablica:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Druga tablica:");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }

        int[] tabSuma = new int[10];

        System.out.println();
        System.out.println();
        System.out.println("Tablica po zsumowaniu: ");

        for (int i = 0; i< tab.length; i++) {
            tabSuma[i] = tab[i] + tab2[i];
            System.out.print(tabSuma[i] + " ");
        }



    }
}
