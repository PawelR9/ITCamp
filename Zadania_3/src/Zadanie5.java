public class Zadanie5 {

     /*
   Return an array that contains the exact same numbers as the given array,
   but rearranged so that all the zeros are grouped at the start of the array.
   The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
   You may modify and return the given array or make a new array.


    zeroFront([1, 0, 0, 1]) ? [0, 0, 1, 1]
    zeroFront([0, 1, 1, 0, 1]) ? [0, 0, 1, 1, 1]
    zeroFront([1, 0]) ? [0, 1]

     */

    public static void main(String[] args) {
        System.out.println("***** Zadanie5 *****");


        int[] initiallTab = {0,1,1,0,1};
        int[] zeroFront = new int[initiallTab.length];

        int zeroPosition = 0;
        int restPosition = initiallTab.length - 1;


        for (int i = 0; i < initiallTab.length; i++) {
            if (initiallTab[i] == 0) {

                zeroFront[zeroPosition] = initiallTab[i];
                zeroPosition++;

            } else {
                zeroFront[restPosition] = initiallTab[i];
                restPosition--;
            }

        }
        for (int i = 0; i < zeroFront.length; i++) {
            System.out.print(zeroFront[i] + " ");
        }
    }
}
