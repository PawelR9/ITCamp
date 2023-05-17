public class RekurencjaZadanie5 {
    /*Zamiana liczb dziesiêtnych na binarne.*/


    public static void main(String[] args) {
        System.out.println("***** Zadanie 5 - rekurencja *****");
        int number = 10;
        System.out.println(toBinary(number));
    }

    private static String toBinary(int number) {
        if (number == 0) {
            return "0";
        } else if (number == 1) {
            return "1";
        } else {
            if (number >= 1) {
                if (number % 2 == 0) {
                    return toBinary(number / 2) + "0";
                } else {
                    return toBinary(number / 2) + "1";
                }

            }
            return "0";
        }
    }

}
