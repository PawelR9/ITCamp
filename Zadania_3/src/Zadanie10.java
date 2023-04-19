public class Zadanie10 {

    /*Given an array of ints, return the number of times that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.


    array667([6, 6, 2]) ? 1
    array667([6, 6, 2, 6]) ? 1
    array667([6, 7, 2, 6]) ? 1*/


    public static void main(String[] args) {
        System.out.println("***** Zadanie10 *****");

        int[] array667 = {6, 7, 2, 6};
        int counter = 0;
        for (int i = 0; i < array667.length - 1; i++) {
            int j = i + 1;
            if ((array667[i] == 6 && array667[j] == 6) || (array667[i] == 6 && array667[j] == 7)) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
