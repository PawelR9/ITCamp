public class CiagGeometryczny {

    /*Program kt�ry wylicza n-ty element ci�gu geometrycznego.
    Na wej�ciu program dostaje pierwszy wyraz ci�gu, iloraz i numer wyrazu kt�ry ma wyliczy�.

    Przyk�ad:
    Wej�cie
    3 2 5
    Wynik
    48*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie - ci�g geometryczny *****");

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


