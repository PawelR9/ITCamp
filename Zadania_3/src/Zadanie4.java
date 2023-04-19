public class Zadanie4 {
      /*
    Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the even numbers come before all the odd numbers.
    Other than that, the numbers can be in any order.
    You may modify and return the given array, or make a new array.


    evenOdd([1, 0, 1, 0, 0, 1, 1]) ? [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) ? [2, 3, 3]
    evenOdd([2, 2, 2]) ? [2, 2, 2]

     */

    public static void main(String[] args) {
        System.out.println("***** Zadanie3 *****");

        int[] evenOdd = {2,2,2};
        int[] evenOddInOrder = new int[evenOdd.length];

        int evenPosition = 0;
        int oddPosition = evenOdd.length - 1;


        for (int i = 0; i < evenOdd.length; i++) {
            if (evenOdd[i] % 2 == 0) {

                evenOddInOrder[evenPosition] = evenOdd[i];
                evenPosition++;

            } else  {
                evenOddInOrder[oddPosition] = evenOdd[i];
                oddPosition--;
            }

        }
        for (int i = 0 ; i<evenOddInOrder.length; i++) {
            System.out.print(evenOddInOrder[i] + " ");
        }



    }
}
