import java.util.SortedMap;

public class Zadanie8 {

    /*Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
    while the other is "far", differing from both other values by 2 or more.
    Note: Math.abs(num) computes the absolute value of a number.


    closeFar(1, 2, 10) ? true
    closeFar(1, 2, 3) ? false
    closeFar(4, 1, 3) ? true*/


    public static void main(String[] args) {
        System.out.println("***** Zadanie8 *****");


        int a, b, c;
        a = 4;
        b = 1;
        c = 3;

        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >=2 && Math.abs(b - c) >= 2) {
            System.out.println(true);
        } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}


