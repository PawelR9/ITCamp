public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 11 *****");

        /*11.Napisz program kt�ry ma 3 zmienna a, b i c. Te zmienne to d�ugo�ci bok�w tr�jk�ta.
        Program ma sprawdzi� czy z podanych bok�w da si� zbudowa� tr�jk�t. Je�li si� da to program
        ma wypisa� na ekranie true (w przeciwnym wypadku false) i obliczy� obw�d tego tr�jk�ta. */

        int a = 3;
        int b = 5;
        int c = 5;

        if (a < b + c && b < a + c && c < a + b ) {
            int L = a + b + c;
            System.out.println("true");
            System.out.println("Obw�d tr�jk�ta wynosi: " + L);
        } else {
            System.out.println("false");
        }
    }
}
