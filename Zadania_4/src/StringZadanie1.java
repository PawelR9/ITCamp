public class StringZadanie1 {

    /*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.


    repeatEnd("Hello", 3) ? "llollollo"
    repeatEnd("Hello", 2) ? "lolo"
    repeatEnd("Hello", 1) ? "o"*/


    public static void main(String[] args) {
        System.out.println("***** Zadanie 1 - string *****");

        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }

    private static String repeatEnd(String string, int n) {

        String lastNChars = string.substring(string.length() - n);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        return result.toString();
    }
}
