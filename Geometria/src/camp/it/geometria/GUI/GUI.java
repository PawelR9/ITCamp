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
                System.out.println(kolo.nazwa());
                System.out.println("Obwód: " + kolo.obwod(figura, i));
                System.out.println("Pole powierzchni: " + kolo.pole(figura, i));
                System.out.println();

            } else if (figura[i].length == 2) {
                System.out.println("Z podanej iloœci boków nie da siê utworzyæ figury");
                System.out.println();


            } else if (figura[i].length == 3) {
                if (figura[i][0] == figura[i][1] && figura[i][0] == figura[i][2]) {
                    System.out.println(trojkatRownoboczny.nazwa());
                    System.out.println("Obwód: " + trojkatRownoboczny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + trojkatRownoboczny.pole(figura, i));
                    System.out.println();

                } else if (figura[i][0] == figura[i][1] || figura[i][1] == figura[i][2] || figura[i][0] == figura[i][2]) {
                    System.out.println(trojkatRownoramienny.nazwa());
                    System.out.println("Obwód: " + trojkatRownoramienny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + trojkatRownoramienny.pole(figura, i));
                    System.out.println();
                } else if ((figura[i][0] + figura[i][1] > figura[i][2])
                        && (figura[i][0] + figura[i][2] > figura[i][1])
                        && (figura[i][1] + figura[i][2] > figura[i][0])) {
                    System.out.println(trojkatRoznoboczny.nazwa());
                    System.out.println("Obwód: " + trojkatRoznoboczny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + trojkatRoznoboczny.pole(figura, i));
                    System.out.println();
                } else {
                    System.out.println("Z podanych boków nie da siê utworzyæ trójk¹ta");
                    System.out.println();
                }


            } else if (figura[i].length == 4) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2] && figura[i][2] == figura[i][3]) {
                    System.out.println(kwadrat.nazwa());
                    System.out.println("Obwód: " + kwadrat.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + kwadrat.pole(figura, i));
                    System.out.println();


                } else if ((figura[i][0] == figura[i][1] && figura[i][2] == figura[i][3]) ||
                        (figura[i][0] == figura[i][2] && figura[i][1] == figura[i][3]) ||
                        (figura[i][0] == figura[i][3] && figura[i][1] == figura[i][2])) {
                    System.out.println(prostokat.nazwa());
                    System.out.println("Obwód: " + prostokat.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + prostokat.pole(figura, i));
                    System.out.println();

                } else if (czworokat.maxElement(figura, i) < figura[i][0] + figura[i][1] + figura[i][2] + figura[i][3]
                        - czworokat.maxElement(figura, i)) {
                    System.out.println(czworokat.nazwa());
                    System.out.println("Obwód: " + czworokat.obwod(figura, i));
                    System.out.println();
                }


            } else if (figura[i].length == 5) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2]
                        && figura[i][2] == figura[i][3] && figura[i][3] == figura[i][4]) {
                    System.out.println(pieciokatForemny.nazwa());
                    System.out.println("Obwód: " + pieciokatForemny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + pieciokatForemny.pole(figura, i));
                    System.out.println();
                } else {
                    System.out.println(pieciokat.nazwa());
                    System.out.println("Obwód: " + pieciokat.obwod(figura, i));
                    System.out.println();
                }


            } else if (figura[i].length == 6) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2]
                        && figura[i][2] == figura[i][3] && figura[i][3] == figura[i][4] && figura[i][4] == figura[i][5]) {
                    System.out.println(szesciokatForemny.nazwa());
                    System.out.println("Obwód: " + szesciokatForemny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + szesciokatForemny.pole(figura, i));
                    System.out.println();

                } else {
                    System.out.println(szesciokat.nazwa());
                    System.out.println("Obwód: " + szesciokat.obwod(figura, i));
                    System.out.println();
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