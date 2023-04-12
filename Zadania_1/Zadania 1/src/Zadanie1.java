import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println("***** Zadanie 1 *****");

     /*   1.Napisz program generuj¹cy jednowymiarow¹ tablice liczb (10 elementów).
      Program powinien posortowaæ tablicê przy pomocy algorytmu sortowania przez
      wstawianie lub przez wybranie (do wyboru, dla chêtnych oba algorytmy).
      Wynikiem dzia³ania programu ma byæ wyœwietlona tablica przed sortowaniem
      oraz posortowana.
*/

        int[] tab = new int[10];
        Random random = new Random();

        System.out.println("Losowa tablica przed sortowaniem:");

        for(int i=0; i< tab.length;i++){
            tab[i] = random.nextInt(30);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("===== Sortowanie przez wstawianie: ");

        for (int i = 1; i < tab.length; i++) {
            int key = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j] > key) {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
            tab[j + 1] = key;
        }

        System.out.println("Posortowana tablica:");

        int[] posortowanaTablica = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            posortowanaTablica[i] = tab[i];
            System.out.print(posortowanaTablica[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("===== Sortowanie przez wybranie:");


        for (int i = 0; i < tab.length-1; i++) {
            int indeksNajmniejszegoElementu = i;
            for (int j = i+1; j < tab.length; j++) {
                if (tab[j] < tab[indeksNajmniejszegoElementu]) {
                    indeksNajmniejszegoElementu = j;
                }
            }
            int temp = tab[indeksNajmniejszegoElementu];
            tab[indeksNajmniejszegoElementu] = tab[i];
            tab[i] = temp;
        }

        System.out.println("Posortowana tablica:");

        int[] posortowanaTablica2 = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            posortowanaTablica2[i] = tab[i];
            System.out.print(posortowanaTablica2[i] + " ");
        }

    }
}