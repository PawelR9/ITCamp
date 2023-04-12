import java.util.Random;

public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 13 *****");

        /*13.Napisz program który symuluje rzuty dwiema kostkami do gry (takie zwyk³e bia³e koœci jak w monopoly).
            Program ma wykonaæ 10 000 rzutów i wypisaæ liczbê która wypada³a najczêœciej
                (ta liczba jest oczywiœcie sum¹ oczek na dwóch koœciach które symulujemy.*/

        Random random = new Random();
        int[] numbers = new int[11];


        for (int i = 0; i < 10000; i++) {
            int rzut1 = random.nextInt(6) + 1;
            int rzut2 = random.nextInt(6) + 1;
            int sum = rzut1 + rzut2;
            numbers[sum-2]++;
        }

        int maxSum = 0;
        int maxCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxCount) {
                maxSum = i+2;
                maxCount = numbers[i];
            }
        }

        System.out.println("Najczêœciej wypadaj¹c¹ sum¹ oczek jest " + maxSum + " (" + maxCount + " razy)");
    }
}


