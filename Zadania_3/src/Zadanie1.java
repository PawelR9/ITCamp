import java.util.Random;

public class Zadanie1 {

    /*Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    countEvens([2, 1, 2, 3, 4]) ? 3
    countEvens([2, 2, 0]) ? 3
    countEvens([1, 3, 5]) ? 0
    */


    public static void main(String[] args) {
        System.out.println("***** Zadanie1 *****");
        int counter = 0;
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10);
            if (tab[i] % 2 == 0) {
                counter++;
            }
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Iloœæ liczb parzystych wynosi: " + counter);


    }
}