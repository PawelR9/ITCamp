public class Zadanie3 {

    /*Given 2 int values greater than 0, return whichever value is nearest to 21 without
    going over. Return 0 if they both go over.


    blackjack(19, 21) ? 21
    blackjack(21, 19) ? 21
    blackjack(19, 22) ? 19*/

    public static int blackjack(int a, int b) {
        if (number(a) > number(b)) {
            return number(a);
        } else if (number(b) > number(a)) {
            return number(b);
        } else if (number(a) == number(b)) {
            return number(a);
        } else {
            return 0;
        }
    }

    public static int number(int n) {
        if (n > 21) {
            return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("***** Zadanie 3 ******");

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19,22));
    }
}

