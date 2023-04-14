public class Zadanie3a {

    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else {
            return Math.max(a, b);
        }
    }

    public static void main(String[] args) {
        System.out.println("***** Zadanie 3a ******");

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19,22));
    }


}
