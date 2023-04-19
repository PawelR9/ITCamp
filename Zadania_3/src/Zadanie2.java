public class Zadanie2 {
    /*
    Return the sum of the numbers in the array, returning 0 for an empty array.
    Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


    sum13([1, 2, 2, 1]) ? 6
    sum13([1, 1]) ? 2
    sum13([1, 2, 2, 1, 13]) ? 6

     */

    public static void main(String[] args) {
        System.out.println("***** Zadanie2 *****");


        int[] sum13 = {1, 2, 2, 1, 13};
        int sum = 0;

        for (int i = 0; i < sum13.length; i++) {
            if (sum13[i] < 13) {
                sum += sum13[i];
            } else {
                sum += 0;
            }
        }
        System.out.println(sum);
    }
}
