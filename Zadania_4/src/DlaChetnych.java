public class DlaChetnych {

    /*DLA CH�TNYCH - troch� trudniejsze zadanie.
    Na wej�ciu program dostaje dowolny string kt�ry sk�ada si� tylko z liter a, b i c np. aaabbcbcbcbabab.
    Program ma zrobi� redukcj� tego stringa.
    Jak dzia�a redukcja: ab i ba zamieniane jest na c, ac i ca zamieniane jest na b, bc i cb zamieniane jest na a.
    Program ma redukowa� stringa maksymalnie jak si� da. Przyk�ad: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a.
    Program wy�wietla a.  Mo�ecie te� sprawdzi� co si� stanie w takich sytuacjach:
    najpierw b�dziecie zamienia� pary ab i ba p�niej ac i ca i na ko�cu bc i cb
    najpierw bc i cb, p�niej ac i ca i na ko�cu ab i ba
    dowolna inna kombinacja kolejno�ci.*/

    public static void main(String[] args) {
        System.out.println("***** Dla ch�tnych *****");


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