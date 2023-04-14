import java.util.Scanner;

public class Zadanie6 {

    /*6.Program zawiera zmienn� n. Napisz program, kt�ry sprawdzi jak� pot�g� liczby 2 jest liczba n.
        Program powinien wy�wietla� pot�g� lub komunikat je�li liczba n nie jest pot�g� liczby 2. Przyk�ad:
    n = 4
            2
    n = 16
            4
    n = 128
            7
    n = 199
    to nie jest pot�ga dw�jki*/

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
                System.out.println("Liczba " + n + " nie jest pot�g� dw�jki");
            }
        } while(true);
    }
}
