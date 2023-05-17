public class LogikaZadanie4 {

    /*We want make a package of goal kilos of chocolate.
    We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars.
    Return -1 if it can't be done.


    makeChocolate(4, 1, 9) ? 4
    makeChocolate(4, 1, 10) ? -1
    makeChocolate(4, 1, 7) ? 2*/

    public static void main(String[] args) {
        System.out.println("***** Zadanie 4 - logika *****");

        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }

    private static int makeChocolate(int small, int big, int goal) {
        int x = Math.min(big, goal/5);
        goal-=5*x;
        if(goal<=small) return goal;
        else return -1;
    }
}