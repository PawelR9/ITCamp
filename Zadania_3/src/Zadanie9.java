public class Zadanie9 {

    /*Given 3 int values, a b c, return their sum. However, if one of the values is 13
    then it does not count towards the sum and values to its right do not count.
    So for example, if b is 13, then both b and c do not count.


    luckySum(1, 2, 3) ? 6
    luckySum(1, 2, 13) ? 3
    luckySum(1, 13, 3) ? 1
*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie9 *****");

        int a = 1, b = 13, c = 13;

        int[] luckySum = {a, b, c};
        int sum = 0;

        for (int i = 0; i < luckySum.length; i++) {
            if (luckySum[i] < 13) {
                sum += luckySum[i];
            } else if (luckySum[i] >= 13) {
                break;
            }
        }
        System.out.println(sum);
    }
}

