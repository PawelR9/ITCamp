public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie10 *****");

        /*10.Napisac program w kt�rym s� 3 zmienne:
        s - liczba ca�kowita - oznacza pierwsz� liczb� ci�gu arytmetycznego
        k - liczba ca�kowita - oznacza krok w ci�gu arytmetycznym
        n - liczba ca�kowita - oznacza ilo�� element�w ci�gu.
                Program ma zwraca� sum� element�w takiego ci�gu. Przyk�ad:
        s = 3, k = 5, n = 4
        program ma wygenerowa� 4 elementy (n), kt�re wygl�daj� dla podanych s i k tak:
        3, 8, 13, 18
        nast�pnie je sumuje i podaje wynik: 42.
        Info o tym jak dzia�a ci�g arytmetyczny jest na wikipedii :)*/

        int s = 3;
        int k = 5;
        int n = 4;

        int[] tab = new int[n];
        tab[0] = s;


        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i - 1] + k;

        }
        for (int i = 0; i < tab.length; i++) {

            System.out.print(tab[i] + " ");
        }

        int a = 0;
        for (int i = 0; i < tab.length; i++) {
            a += tab[i];
            tab[i] = tab[i] + tab[i];
        }
        System.out.println();
        System.out.print("Suma liczb ci�gu wynosi: " + a);


    }
}
