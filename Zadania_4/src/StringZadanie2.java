public class StringZadanie2 {


    /*Given a string, does "xyz" appear in the middle of the string?
    To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    This problem is harder than it looks.


    xyzMiddle("AAxyzBB") ? true
    xyzMiddle("AxyzBB") ? true
    xyzMiddle("AxyzBBB") ? false
    */

    public static void main(String[] args) {
        System.out.println("***** Zadanie 2 - string *****");

        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));

    }

    private static boolean xyzMiddle(String string) {


        if (string.length() < 3) {
            return false;
        }
        int middle1 = string.length() / 2 - 2;
        int middle2 = string.length() / 2 - 1;

        if (string.length() % 2 == 0) {

            return string.substring(middle1, middle1 + 3).equals("xyz")
                    || string.substring(middle2, middle2 + 3).equals("xyz");
        }
        return string.substring(middle2, middle2 + 3).equals("xyz");
    }

}
