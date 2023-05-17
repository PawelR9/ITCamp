public class RekurencjaZadanie3 {

   /* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


    countX("xxhixx") ? 4
    countX("xhixhix") ? 3
    countX("hi") ? 0*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 3 - rekurencja *****");
        String string = "xgvzxgzxfgxzsfxgasxgszxxxgzxserxXXXX";
        System.out.println("The number of lowercase 'x' chars in the string is: " + countX(string));
    }

    private static int countX(String string) {
        if (string.isEmpty()) {
            return 0;
        } else if (string.charAt(0) == 'x') {
            return 1 + countX(string.substring(1));
        }else {
            return countX(string.substring(1));
        }
    }

}
