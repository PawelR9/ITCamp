public class Zadanie12 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 12 *****");

        /*12.Napisz program który ma dwie zmienne:
        weight - waga, liczba ca³kowita
        height - wzrost, liczba ca³kowita
        program ma obliczaæ BMI (wskaŸnik masy cia³a, wzór do znalezienia w internecie, gdybyœcie nie znaleŸli to piszcie)
        i na podstawie wyliczonego BMI wypisywaæ "Nadwaga, Niedowaga, W normie itp.*/

        int weight = 70;
        int height = 175;
        double BMI = ((double)weight / (((double)height/100) * ((double)height/100)));

        if(BMI>24.9) {
            System.out.println("Nadwaga");
        } else if (BMI<18.5) {
            System.out.println("Niedowaga");
        } else {
            System.out.println("W normie");
        }
    }
}
