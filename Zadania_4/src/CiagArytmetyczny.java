public class CiagArytmetyczny {

    /*Program kt�ry wylicza n-ty element ci�gu arytmetycznego.
    Na wej�ciu program dostaje pierwszy wyraz ci�gu, r�nic� i numer wyrazu kt�ry ma wyliczy�.

    Przyk�ad dzia�ania programu:
    Wej�cie
    2 5 4
    Wynik
    17
    */

    public static void main(String[] args) {
        System.out.println("***** Zadanie - ci�g arytmetyczny *****");

        System.out.println(arithmeticSequence(2, 5, 4));


    }

    private static int arithmeticSequence(int beginNumber, int difference, int position) {

        return beginNumber + difference * (position - 1);
    }
}


