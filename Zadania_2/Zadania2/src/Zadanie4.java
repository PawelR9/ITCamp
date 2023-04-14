public class Zadanie4 {

       /*4.Napisz program w kt�rym zdefiniowana jest zmienna n. Program ma wy�wietla� n element�w ci�gu Fibonacciego.
    Co to jest ci�g Fibonacciego znajdziecie na wikipedii. Przyk�ad:
    n = 3
    0 1 1
    n = 8
    0 1 1 2 3 5 8 13*/

    public static void main(String[] args) {

        System.out.println("***** Zadanie 4 ******");

        int n = 8;

        int previousNumber = 0;
        int currentNumber = 1;

        System.out.print("Ci�g Fibo " + n + " element�w: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = sum;

        }
    }
}


