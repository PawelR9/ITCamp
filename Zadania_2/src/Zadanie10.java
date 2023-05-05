import java.util.Random;

public class Zadanie10 {

    /*10.Napisz program generuj�cy 3 tablice 10 elementowe (liczby -20 do 20).
    Program ma sprawdzi� czy w ka�dej z tablic znajduj� si� 3 takie same elementy,
    je�li nie to generuje tablice ponownie.
    Program ma wypisywa� wygenerowane tablice oraz ilo�� ponownych generacji tablic.
*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 10 ******");

        Random random = new Random();
        int counter = 0;
        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int[] tab3 = new int[10];

        boolean containsSameElement = false;
        while (!containsSameElement) {

            for (int i = 0; i < tab1.length; i++) {
                tab1[i] = random.nextInt(41) - 20;
                tab2[i] = random.nextInt(41) - 20;
                tab3[i] = random.nextInt(41) - 20;
            }
            for (int i = 0; i < tab1.length; i++) {
                for (int j = 0; j < tab2.length; j++) {
                    for (int k = 0; k < tab3.length; k++) {
                        if ((tab1[i] == tab2[j] && tab2[j] == tab3[k])) {
                            containsSameElement = true;
                            break;
                        }
                    }
                }
            }
            if (!containsSameElement) {
                counter++;
            }
        }

        System.out.println("Wygenerowana tablica 1: ");
        for (
                int i = 0;
                i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        System.out.println("Wygenerowana tablica 2: ");
        for (
                int i = 0;
                i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        System.out.println("Wygenerowana tablica 3: ");
        for (
                int i = 0;
                i < tab3.length; i++) {
            System.out.print(tab3[i] + " ");
        }
        System.out.println();
        System.out.println("Liczba ponownych generacji: " + counter);
    }
}


