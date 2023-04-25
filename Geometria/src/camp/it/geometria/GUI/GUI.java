package camp.it.geometria.GUI;

import camp.it.geometria.figury.*;

import java.util.Scanner;


public class GUI {

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczb� figur, kt�re chcesz przeanalizowa�:");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] figura = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj zestaw bok�w " + (i + 1) + " figury oddzielonych spacj�: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Nic nie podano. Spr�buj raz jeszcze.");
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
                System.out.println("Obw�d: " + kolo.obwod(figura, i));
                System.out.println("Pole powierzchni: " + kolo.pole(figura, i));
                System.out.println();

            } else if (figura[i].length == 2) {
                System.out.println("Z podanej ilo�ci bok�w nie da si� utworzy� figury");
                System.out.println();


            } else if (figura[i].length == 3) {
                if (figura[i][0] == figura[i][1] && figura[i][0] == figura[i][2]) {
                    System.out.println(trojkatRownoboczny.nazwa());
                    System.out.println("Obw�d: " + trojkatRownoboczny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + trojkatRownoboczny.pole(figura, i));
                    System.out.println();

                } else if (figura[i][0] == figura[i][1] || figura[i][1] == figura[i][2] || figura[i][0] == figura[i][2]) {
                    System.out.println(trojkatRownoramienny.nazwa());
                    System.out.println("Obw�d: " + trojkatRownoramienny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + trojkatRownoramienny.pole(figura, i));
                    System.out.println();
                } else if ((figura[i][0] + figura[i][1] > figura[i][2])
                        && (figura[i][0] + figura[i][2] > figura[i][1])
                        && (figura[i][1] + figura[i][2] > figura[i][0])) {
                    System.out.println(trojkatRoznoboczny.nazwa());
                    System.out.println("Obw�d: " + trojkatRoznoboczny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + trojkatRoznoboczny.pole(figura, i));
                    System.out.println();
                } else {
                    System.out.println("Z podanych bok�w nie da si� utworzy� tr�jk�ta");
                    System.out.println();
                }


            } else if (figura[i].length == 4) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2] && figura[i][2] == figura[i][3]) {
                    System.out.println(kwadrat.nazwa());
                    System.out.println("Obw�d: " + kwadrat.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + kwadrat.pole(figura, i));
                    System.out.println();


                } else if ((figura[i][0] == figura[i][1] && figura[i][2] == figura[i][3]) ||
                        (figura[i][0] == figura[i][2] && figura[i][1] == figura[i][3]) ||
                        (figura[i][0] == figura[i][3] && figura[i][1] == figura[i][2])) {
                    System.out.println(prostokat.nazwa());
                    System.out.println("Obw�d: " + prostokat.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + prostokat.pole(figura, i));
                    System.out.println();

                } else if (czworokat.maxElement(figura, i) < figura[i][0] + figura[i][1] + figura[i][2] + figura[i][3]
                        - czworokat.maxElement(figura, i)) {
                    System.out.println(czworokat.nazwa());
                    System.out.println("Obw�d: " + czworokat.obwod(figura, i));
                    System.out.println();
                }


            } else if (figura[i].length == 5) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2]
                        && figura[i][2] == figura[i][3] && figura[i][3] == figura[i][4]) {
                    System.out.println(pieciokatForemny.nazwa());
                    System.out.println("Obw�d: " + pieciokatForemny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + pieciokatForemny.pole(figura, i));
                    System.out.println();
                } else {
                    System.out.println(pieciokat.nazwa());
                    System.out.println("Obw�d: " + pieciokat.obwod(figura, i));
                    System.out.println();
                }


            } else if (figura[i].length == 6) {
                if (figura[i][0] == figura[i][1] && figura[i][1] == figura[i][2]
                        && figura[i][2] == figura[i][3] && figura[i][3] == figura[i][4] && figura[i][4] == figura[i][5]) {
                    System.out.println(szesciokatForemny.nazwa());
                    System.out.println("Obw�d: " + szesciokatForemny.obwod(figura, i));
                    System.out.println("Pole powierzchni: " + szesciokatForemny.pole(figura, i));
                    System.out.println();

                } else {
                    System.out.println(szesciokat.nazwa());
                    System.out.println("Obw�d: " + szesciokat.obwod(figura, i));
                    System.out.println();
                }

            } else {
                System.out.println("Zbyt wiele bok�w");
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