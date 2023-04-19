public class Zadanie3 {

     /*
    Given an array of ints, return true if the array contains no 1's and no 3's.


    lucky13([0, 2, 4]) ? true
    lucky13([1, 2, 3]) ? false
    lucky13([1, 2, 4]) ? false

     */

    public static void main(String[] args) {
        System.out.println("***** Zadanie3 *****");

        int[] lucky13 = {1,2,4};

        for (int i = 0; i < lucky13.length; i++) {
            if (lucky13[i] == 1 || lucky13[i] == 3 ) {
                System.out.println(false);
                break;
            }else {
                System.out.println(true);
                break;
            }
        }
    }
}
