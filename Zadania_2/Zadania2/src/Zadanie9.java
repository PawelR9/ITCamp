import java.util.Random;

public class Zadanie9 {

   /* 9.Napisz program generuj¹cy tablicê liczb 10 elementow¹ (liczby -7 do 7). Program sprawdza czy
        tablica zawiera duplikaty, jeœli zawiera to generuje now¹. Program ma wyœwietliæ wygenerowan¹ tablicê
        bez duplikatów oraz iloœæ powtórnych generacji tablicy.*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 9 ******");


        int[] tab = new int[10];
        Random random = new Random();
        int tries = 0;

        do {
            tries++;
            for (int i = 0; i < tab.length; i++) {
                tab[i] = random.nextInt(15) - 7;
            }
        } while (hasDuplicates(tab));

        System.out.println("Wygenerowana tablica: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println("Iloœæ powtórnych generacji tablicy: " + tries);
    }

    private static boolean hasDuplicates(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}




