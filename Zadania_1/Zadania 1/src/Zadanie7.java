import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {

        System.out.println("***** Zadanie 7 *****");

        /*7. Napisz program kt�ry generuje jednowymiarow� tablic� (10 element�w) losowych liczb.
        Program ma wygenerowa� druga tablic�, kt�ra jest pierwsz� tablic� w odwrotnej kolejno�ci.
        Wynikiem dzia�ania programu ma by� wy�wietlona pierwsza i druga tablica. Przyk�ady:
        3, 23, 2, 23, 53
        53, 23, 2, 23, 3
        45, 23, 65, 1, 54
        54, 1, 65, 23, 45
        Zakres losowych liczb 0 - 100.*/

        int[] tab = new int[10];
        Random random = new Random();

        System.out.println("Pierwsza tablica:");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println("Tablica odwr�cona: ");
        int[] reverseTab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            reverseTab[i] = tab[tab.length - i - 1];
            System.out.print(reverseTab[i] + " ");
        }
    }
}


