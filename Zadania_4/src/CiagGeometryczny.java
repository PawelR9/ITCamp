public class CiagGeometryczny {

    /*Program który wylicza n-ty element ci¹gu geometrycznego.
    Na wejœciu program dostaje pierwszy wyraz ci¹gu, iloraz i numer wyrazu który ma wyliczyæ.

    Przyk³ad:
    Wejœcie
    3 2 5
    Wynik
    48*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie - ci¹g geometryczny *****");

        System.out.println(geometricSequence(3, 2, 5));

    }

    private static int geometricSequence(int beginNumber, int quotient, int position) {
        if (position == 1) {
            return beginNumber;
        } else {
            return quotient * geometricSequence(beginNumber, quotient, position-1);
        }
    }
}


