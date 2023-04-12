import java.util.Random;

public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 13 *****");

        /*13.Napisz program kt�ry symuluje rzuty dwiema kostkami do gry (takie zwyk�e bia�e ko�ci jak w monopoly).
            Program ma wykona� 10 000 rzut�w i wypisa� liczb� kt�ra wypada�a najcz�ciej
                (ta liczba jest oczywi�cie sum� oczek na dw�ch ko�ciach kt�re symulujemy.*/

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

        System.out.println("Najcz�ciej wypadaj�c� sum� oczek jest " + maxSum + " (" + maxCount + " razy)");
    }
}


