public class RekurencjaZadanie4 {
   /* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


    allStar("hello") ? "h*e*l*l*o"
    allStar("abc") ? "a*b*c"
    allStar("ab") ? "a*b"*/


    public static void main(String[] args) {
        System.out.println("***** Zadanie 4 - rekurencja *****");
        String string = "hello";
        System.out.println(allStar(string));
    }

    private static String allStar(String string) {
        if (string.length() <= 1) {
            return string;
        } else {
            return string.charAt(0) + "*" + allStar(string.substring(1));

        }
    }
}
