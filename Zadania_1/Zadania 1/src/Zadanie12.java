public class Zadanie12 {
    public static void main(String[] args) {
        System.out.println("***** Zadanie 12 *****");

        /*12.Napisz program kt�ry ma dwie zmienne:
        weight - waga, liczba ca�kowita
        height - wzrost, liczba ca�kowita
        program ma oblicza� BMI (wska�nik masy cia�a, wz�r do znalezienia w internecie, gdyby�cie nie znale�li to piszcie)
        i na podstawie wyliczonego BMI wypisywa� "Nadwaga, Niedowaga, W normie itp.*/

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
