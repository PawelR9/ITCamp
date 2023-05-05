package camp.it.geometria.figury;

public class Czworokat extends Figura {


    @Override
    public String nazwa() {
        return "Czworok¹t";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return figura[i][0] + figura[i][1] + figura[i][2] + figura[i][3];
    }

    @Override
    public double pole(int[][] figura, int i) {
        return 0;
    }

    public int maxElement(int[][] figura, int i) {
        int max = figura[i][0];
        for (int j = 1; j < figura[i].length; j++) {
            if (figura[i][j] > max) {
                max = figura[i][j];
            }
        }
        return max;
    }

    public void obliczCzworokat(int[][] figura, int i) {
        System.out.println(nazwa());
        System.out.println("Obwód: " + obwod(figura, i));
        System.out.println();
    }

}
