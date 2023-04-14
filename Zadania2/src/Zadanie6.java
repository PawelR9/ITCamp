import java.util.Scanner;

public class Zadanie6 {

    /*6.Program zawiera zmienn¹ n. Napisz program, który sprawdzi jak¹ potêg¹ liczby 2 jest liczba n.
        Program powinien wyœwietlaæ potêgê lub komunikat jeœli liczba n nie jest potêg¹ liczby 2. Przyk³ad:
    n = 4
            2
    n = 16
            4
    n = 128
            7
    n = 199
    to nie jest potêga dwójki*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 6 ******");


        do {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int power = 0;
            int number = 1;

            while (number < n) {
                number *= 2;
                power++;
            }

            if (number == n) {
                System.out.println(power);
            } else {
                System.out.println("Liczba " + n + " nie jest potêg¹ dwójki");
            }
        } while(true);
    }
}
