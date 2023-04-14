public class Zadanie8 {

    /*8.Napisz program w którym jest tablica zawieraj¹ca liczby od 2 do 101 (w³¹cznie).
        Program ma wypisaæ liczby pierwsze znajduj¹ce siê w tej tablicy. Nale¿y wykorzystaæ sito Eratostenesa.
        Sito Eratostenesa znajdziecie na wikipedii.*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 8 ******");


        int[] numbers = new int[100];
        for (int i = 2; i <= 101; i++) {
            numbers[i - 2] = i;
        }
        boolean[] isPrime = new boolean[100];
        for (int i = 0; i < 100; i++) {
            isPrime[i] = true;
        }
        for (int i = 0; i < 100; i++) {
            if (isPrime[i]) {
                int prime = numbers[i];
                System.out.print(prime + " ");
                for (int j = i + 1; j < 100; j++) {
                    if (numbers[j] % prime == 0) {
                        isPrime[j] = false;
                    }
                }
            }
        }
    }
}




