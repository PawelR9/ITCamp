public class CiagArytmetyczny {

    /*Program który wylicza n-ty element ci¹gu arytmetycznego.
    Na wejœciu program dostaje pierwszy wyraz ci¹gu, ró¿nicê i numer wyrazu który ma wyliczyæ.

    Przyk³ad dzia³ania programu:
    Wejœcie
    2 5 4
    Wynik
    17
    */

    public static void main(String[] args) {
        System.out.println("***** Zadanie - ci¹g arytmetyczny *****");

        System.out.println(arithmeticSequence(2, 5, 4));


    }

    private static int arithmeticSequence(int beginNumber, int difference, int position) {

        return beginNumber + difference * (position - 1);
    }
}


