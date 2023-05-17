public class TabliceZadanie1 {

   /* Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
      Return the number of clumps in the given array.


    countClumps([1, 2, 2, 3, 4, 4]) ? 2
    countClumps([1, 1, 2, 1, 1]) ? 2
    countClumps([1, 1, 1, 1, 1]) ? 1*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 1 - tablice *****");

        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));

    }

    private static int countClumps(int[] numbersTab) {
        int counter = 0;
        boolean isCount = false;
        for (int i = 0; i < numbersTab.length - 1; i++) {
            if (isCount) {
                if (numbersTab[i] != numbersTab[i + 1]) {
                    isCount = false;
                }
            } else if (numbersTab[i] == numbersTab[i + 1]) {
                isCount = true;
                counter++;
            }
        }
        return counter;
    }
}




