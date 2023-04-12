import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 5 *****");

        /*5. Napisz program który generuje jednowymiarow¹ tablicê (10 elementów) losowych liczb.
        Wynikiem dzia³ania programu ma byæ wygenerowana tablica oraz iloœæ powtórzeñ liczby 5.
        Zakres losowych liczb 0 - 10.*/

        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(11);
            System.out.print(tab[i] + " ");
        }

        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 5) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Iloœæ powtórzeñ liczby 5: " + count);
    }
}
