import java.util.Random;

public class Zadanie6 {

     /*
    Given n>=0, create an array length n*n with the following pattern,
    shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


    squareUp(3) ? [0, 0, 1, 0, 2, 1, 3, 2, 1]
    squareUp(2) ? [0, 1, 2, 1]
    squareUp(4) ? [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

     */

    public static void main(String[] args) {
        System.out.println("***** Zadanie6 *****");

        int n = 4;
        int[] tab = new int[n*n];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10);
            if (tab[i] % 2 == 0) {

            }
            System.out.print(tab[i] + " ");

    }
}}
