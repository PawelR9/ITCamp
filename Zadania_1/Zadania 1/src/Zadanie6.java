public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println("***** Zadanie 6 *****");

        /*Wypisz na ekranie liczby od 0 do 99. Jeœli liczba jest podzielna przez 3 obok liczby dopisz "Fizz",
        jeœli liczba jest podzielna przez 5 obok liczby dopisz "Buzz", jeœli liczba jest podzielna
        przez 3 i 5 obok liczby dopisz "Fizz Buzz". Przyk³ad:
        1
        2
        3 Fizz
        4
        5 Buzz
        6 Fizz
        7
        8
        9 Fizz
        10
        11
        12 Fizz
        13
        14
        15 Fizz Buzz
        16
        itd.
        */

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ". Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println(i + ". Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ". Fizz");
            } else {
                System.out.println(i + ". ");
            }
        }
    }
}
