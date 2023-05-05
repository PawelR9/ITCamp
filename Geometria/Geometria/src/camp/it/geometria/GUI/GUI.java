package camp.it.geometria.GUI;

import camp.it.geometria.figury.*;

import java.util.Scanner;


public class GUI {

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbê figur, które chcesz przeanalizowaæ:");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] figura = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj zestaw boków " + (i + 1) + " figury oddzielonych spacj¹: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Nic nie podano. Spróbuj raz jeszcze.");
                i--;
                continue;
            }
            String[] numbers = input.split(" ");
            figura[i] = new int[numbers.length];
            for (int j = 0; j < figura[i].length; j++) {
                figura[i][j] = Integer.parseInt(numbers[j]);
            }

            if (figura[i].length == 1) {
                kolo.obliczKolo(figura, i);

            } else if (figura[i].length == 2) {
                System.out.println("Z podanej iloœci boków nie da siê utworzyæ figury");
                System.out.println();


            } else if (figura[i].length == 3) {
                if (figura[i][0] == figura[i][1] && figura[i][0] == figura[i][2]) {
                    trojkatRownoboczny.obliczTrojkatRownoboczny(figura, i);

                } else if (figura[i][0] == figura[i][1] || figura[i][1] == figura[i][2] || figura[i][0] == figura[i][2]) {
                    trojkatRownoramienny.obliczTrojkatRownoramienny(figura, i);

                } else if ((figura[i][0] + figura[i][1] > figura[i][2])
                        && (figura[i][0] + figura[i][2] > figura[i][1])
                        && (figura[i][1] + figura[i][2] > figura[i][0])) {
                    trojkatRoznoboczny.obliczTrojkatRoznoboczny(figura, i);
                } else {
                    System.out.println("Z podanych boków nie da siê utworzyæ trójk¹ta");
                    System.out.println();
                }


            } else if (figura[i].length == 4) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2] && figura[i][2] == figura[i][3]) {
                    kwadrat.obliczKwadrat(figura, i);

                } else if ((figura[i][0] == figura[i][1] && figura[i][2] == figura[i][3]) ||
                        (figura[i][0] == figura[i][2] && figura[i][1] == figura[i][3]) ||
                        (figura[i][0] == figura[i][3] && figura[i][1] == figura[i][2])) {
                    prostokat.obliczProstokat(figura, i);

                } else if (czworokat.maxElement(figura, i) < figura[i][0] + figura[i][1] + figura[i][2] + figura[i][3]
                        - czworokat.maxElement(figura, i)) {
                    czworokat.obliczCzworokat(figura, i);
                }


            } else if (figura[i].length == 5) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2]
                        && figura[i][2] == figura[i][3] && figura[i][3] == figura[i][4]) {
                    pieciokatForemny.obliczPieciokatForemny(figura, i);
                } else {
                    pieciokat.obliczPieciokat(figura, i);
                }


            } else if (figura[i].length == 6) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2]
                        && figura[i][2] == figura[i][3] && figura[i][3] == figura[i][4] && figura[i][4] == figura[i][5]) {
                    szesciokatForemny.obliczSzesciokatForemny(figura, i);

                } else {
                    szesciokat.obliczSzesciokat(figura, i);
                }

            } else {
                System.out.println("Zbyt wiele boków");
                System.out.println();
            }
        }
    }


    static Kolo kolo = new Kolo();
    static TrojkatRownoboczny trojkatRownoboczny = new TrojkatRownoboczny();
    static TrojkatRoznoboczny trojkatRoznoboczny = new TrojkatRoznoboczny();
    static TrojkatRownoramienny trojkatRownoramienny = new TrojkatRownoramienny();
    static Kwadrat kwadrat = new Kwadrat();
    static Prostokat prostokat = new Prostokat();
    static Czworokat czworokat = new Czworokat();
    static PieciokatForemny pieciokatForemny = new PieciokatForemny();
    static Pieciokat pieciokat = new Pieciokat();
    static SzesciokatForemny szesciokatForemny = new SzesciokatForemny();
    static Szesciokat szesciokat = new Szesciokat();
}