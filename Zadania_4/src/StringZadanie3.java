import java.awt.*;
import java.util.Map;

public class StringZadanie3 {

   /* Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
    the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


    mixString("abc", "xyz") ? "axbycz"
    mixString("Hi", "There") ? "HTihere"
    mixString("xxxx", "There") ? "xTxhxexre"*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 3 - string *****");

        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    private static String mixString(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int x = 0;
        String total = "";
        while (x < min) {
            String asub = a.substring(x, x + 1);
            String bsub = b.substring(x, x + 1);
            total = total + asub + bsub;
            x++;
        }
        return total + a.substring(x) + b.substring(x);
    }

}
