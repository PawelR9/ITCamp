import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 4 *****");

        /*4.Napisz program generuj�cy jednowymiarow� tablic� (10 element�w) liczb w kt�rej ka�da
         liczba jest losowa ale nie jest mniejsza ni� poprzednia liczba. Przyk�ady:
        23, 34, 53, 60, 80
        0, 10, 70, 70, 70
        nieprawid�owy wynik:
        34, 56, 34, 78, 99 - trzecia liczba jest mniejsza ni� poprzednia (druga).
                Wynikiem dzia�ania programu ma by� wy�wietlona wygenerowana tablica. Zakres losowych liczb 0 - 20.*/

        int[] tab = new int[10];
        Random random = new Random();

        tab[0] = random.nextInt(21);
        for (int i = 1; i < 10; i++) {
            tab[i] = random.nextInt(21 - tab[i-1]) + tab[i-1];
        }

        System.out.println("Wygenerowana tablica: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tab[i] + " ");
        }



    }
}
