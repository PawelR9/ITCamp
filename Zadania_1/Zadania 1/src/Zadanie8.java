import java.util.Random;

public class Zadanie8 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 8 *****");

        /*8.Napisz program kt�ry generuje dwie tablice (10 element�w) losowych liczb.
        Wynikiem dzia�ania programu maj� by� wy�wietlone obie tablice oraz trzecia tablica
        b�d�ca po��czeniem dw�ch wygenerowanych. Przyk�ad:
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

        System.out.println("Po��czone obie tablice:");
        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i] + " ");
        }
    }
}
