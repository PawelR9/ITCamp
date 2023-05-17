public class TabliceZadanie2 {

    /* Given a non-empty array, return true if there is a place to split the array
       so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


    canBalance([1, 1, 1, 2, 1]) ? true
    canBalance([2, 1, 1, 2, 1]) ? false
    canBalance([10, 10]) ? true*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 1 - tablice *****");

        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));


    }

    private static boolean canBalance(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++)
                sum += numbers[j];
            for (int j = i; j < numbers.length; j++)
                sum -= numbers[j];
            if (sum == 0)
                return true;
        }
        return false;
    }
}
