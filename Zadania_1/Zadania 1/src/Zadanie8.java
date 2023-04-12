import java.util.Random;

public class Zadanie8 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 8 *****");

        /*8.Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
        Wynikiem dzia³ania programu maj¹ byæ wyœwietlone obie tablice oraz trzecia tablica
        bêd¹ca po³¹czeniem dwóch wygenerowanych. Przyk³ad:
        3, 5, 12, 34, 45
        45, 21, 65, 23, 1
        3, 5, 12, 34, 45, 45, 21, 65, 23, 1*/
        System.out.println();

        int[] tab = new int[5];
        int[] tab2 = new int[5];
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

        int[] tab3 = new int[tab.length + tab2.length];

        for (int i = 0; i < tab.length; i++) {
            tab3[i] = tab[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tab3[tab.length + i] = tab2[i];
        }

        System.out.println();
        System.out.println();

        System.out.println("Po³¹czone obie tablice:");
        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i] + " ");
        }
    }
}
