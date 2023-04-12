import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 3 *****");

        /*3.    Napisz program generuj�cy dwuwymiarow� tablice (5x5) losowych liczb.
        Wynikiem dzia�ania programu ma by� wy�wietlona tablica oraz najmniejsza
        liczba z tej tablicy. Zakres losowych liczb 0 - 100.*/

        int[][] tab = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(101);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        int min = tab[0][0];

        for (int k = 0; k < tab.length; k++) {
            for (int f = 0; f < tab[k].length; f++) {
                if (tab[k][f] < min) {
                    min = tab[k][f];
                }
            }
        }

        System.out.println("Minimalna warto�� w tablicy: " + min);
    }
}
