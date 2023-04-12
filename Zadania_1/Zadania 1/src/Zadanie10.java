public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie10 *****");

        /*10.Napisac program w którym s¹ 3 zmienne:
        s - liczba ca³kowita - oznacza pierwsz¹ liczbê ci¹gu arytmetycznego
        k - liczba ca³kowita - oznacza krok w ci¹gu arytmetycznym
        n - liczba ca³kowita - oznacza iloœæ elementów ci¹gu.
                Program ma zwracaæ sumê elementów takiego ci¹gu. Przyk³ad:
        s = 3, k = 5, n = 4
        program ma wygenerowaæ 4 elementy (n), które wygl¹daj¹ dla podanych s i k tak:
        3, 8, 13, 18
        nastêpnie je sumuje i podaje wynik: 42.
        Info o tym jak dzia³a ci¹g arytmetyczny jest na wikipedii :)*/

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
        System.out.print("Suma liczb ci¹gu wynosi: " + a);


    }
}
