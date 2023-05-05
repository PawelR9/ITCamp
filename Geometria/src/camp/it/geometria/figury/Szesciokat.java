package camp.it.geometria.figury;

public class Szesciokat extends Figura{


    @Override
    public String nazwa() {
        return "Szeœciok¹t";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return figura[i][0] + figura[i][1] + figura[i][2] + figura[i][3] + figura[i][4] + figura[i][5];
    }

    @Override
    public double pole(int[][] figura, int i) {
        return 0;
    }

    public void obliczSzesciokat(int[][] figura, int i) {
        System.out.println(nazwa());
        System.out.println("Obwód: " + obwod(figura, i));
        System.out.println();
    }
}
