import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {

        System.out.println("***** Zadanie 7 *****");

        /*7. Napisz program który generuje jednowymiarow¹ tablicê (10 elementów) losowych liczb.
        Program ma wygenerowaæ druga tablicê, która jest pierwsz¹ tablic¹ w odwrotnej kolejnoœci.
        Wynikiem dzia³ania programu ma byæ wyœwietlona pierwsza i druga tablica. Przyk³ady:
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
        System.out.println("Tablica odwrócona: ");
        int[] reverseTab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            reverseTab[i] = tab[tab.length - i - 1];
            System.out.print(reverseTab[i] + " ");
        }
    }
}


