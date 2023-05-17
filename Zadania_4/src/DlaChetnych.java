public class DlaChetnych {

    /*DLA CHÊTNYCH - trochê trudniejsze zadanie.
    Na wejœciu program dostaje dowolny string który sk³ada siê tylko z liter a, b i c np. aaabbcbcbcbabab.
    Program ma zrobiæ redukcjê tego stringa.
    Jak dzia³a redukcja: ab i ba zamieniane jest na c, ac i ca zamieniane jest na b, bc i cb zamieniane jest na a.
    Program ma redukowaæ stringa maksymalnie jak siê da. Przyk³ad: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a.
    Program wyœwietla a.  Mo¿ecie te¿ sprawdziæ co siê stanie w takich sytuacjach:
    najpierw bêdziecie zamieniaæ pary ab i ba póŸniej ac i ca i na koñcu bc i cb
    najpierw bc i cb, póŸniej ac i ca i na koñcu ab i ba
    dowolna inna kombinacja kolejnoœci.*/

    public static void main(String[] args) {
        System.out.println("***** Dla chêtnych *****");


        System.out.println(stringReduce("ababcbcbacab"));

    }

    private static String stringReduce(String string) {
        StringBuilder sb = new StringBuilder(string);

        boolean isReduction = true;

        while (isReduction) {
            isReduction = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b'
                        || sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                    sb.replace(i, i + 2, "c");
                    isReduction = true;
                } else if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'c'
                        || sb.charAt(i) == 'c' && sb.charAt(i + 1) == 'b') {
                    sb.replace(i, i + 2, "a");
                    isReduction = true;
                } else if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'c'
                        || sb.charAt(i) == 'c' && sb.charAt(i + 1) == 'a') {
                    sb.replace(i, i + 2, "b");
                    isReduction = true;
                }
            }
        }
        return sb.toString();
    }
}