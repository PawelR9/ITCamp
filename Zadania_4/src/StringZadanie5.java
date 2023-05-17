public class StringZadanie5 {

    /*We'll say that a "triple" in a string is a char appearing three times in a row.
    Return the number of triples in the given string. The triples may overlap.


    countTriple("abcXXXabc") ? 1
    countTriple("xxxabyyyycd") ? 3
    countTriple("a") ? 0*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 5 - string *****");

        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }

    private static int countTriple(String string) {
        int counter= 0;
        if (string.length()<3) {
            return 0;
        }else {
            for(int i=0; i<string.length()-2; i++) {

                if(string.charAt(i) == string.charAt(i+1) && string.charAt(i)  == string.charAt(i+2)) {
                    counter++;
                }
            }
        }return counter;
    }
}
