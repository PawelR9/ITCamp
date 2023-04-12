public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 11 *****");

        /*11.Napisz program który ma 3 zmienna a, b i c. Te zmienne to d³ugoœci boków trójk¹ta.
        Program ma sprawdziæ czy z podanych boków da siê zbudowaæ trójk¹t. Jeœli siê da to program
        ma wypisaæ na ekranie true (w przeciwnym wypadku false) i obliczyæ obwód tego trójk¹ta. */

        int a = 3;
        int b = 5;
        int c = 5;

        if (a < b + c && b < a + c && c < a + b ) {
            int L = a + b + c;
            System.out.println("true");
            System.out.println("Obwód trójk¹ta wynosi: " + L);
        } else {
            System.out.println("false");
        }
    }
}
