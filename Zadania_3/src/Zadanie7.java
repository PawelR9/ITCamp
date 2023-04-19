public class Zadanie7 {
    /*
    This is a slightly harder version of the fix34 problem.
    Return an array that contains exactly the same numbers as the given array,
    but rearranged so that every 4 is immediately followed by a 5.
    Do not move the 4's, but every other number may move.
    The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
    In this version, 5's may appear anywhere in the original array.


    fix45([5, 4, 9, 4, 9, 5]) ? [9, 4, 5, 4, 5, 9]
    fix45([1, 4, 1, 5]) ? [1, 4, 5, 1]
    fix45([1, 4, 1, 5, 5, 4, 1]) ? [1, 4, 5, 1, 1, 4, 5]

     */

    public static void main(String[] args) {
        System.out.println("***** Zadanie7 *****");

        int[] tab = {1, 4, 1, 5, 5, 4, 1};


        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 5 && i == 0 || tab[i] == 5 && tab[i - 1] != 4) {
                int positionOf5 = i;
                for (int j = 0; j < tab.length; j++) {
                    if (tab[j] == 4 && tab[j + 1] != 5) {
                        int temp = tab[j + 1];
                        tab[j + 1] = 5;
                        tab[positionOf5] = temp;
                        break;

                    }
                }
            }
        }
        for (int i = 0; i < tab
                .length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}