public class Zadanie4 {

       /*4.Napisz program w którym zdefiniowana jest zmienna n. Program ma wyœwietlaæ n elementów ci¹gu Fibonacciego.
    Co to jest ci¹g Fibonacciego znajdziecie na wikipedii. Przyk³ad:
    n = 3
    0 1 1
    n = 8
    0 1 1 2 3 5 8 13*/

    public static void main(String[] args) {

        System.out.println("***** Zadanie 4 ******");

        int n = 8;

        int previousNumber = 0;
        int currentNumber = 1;

        System.out.print("Ci¹g Fibo " + n + " elementów: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = sum;

        }
    }
}


