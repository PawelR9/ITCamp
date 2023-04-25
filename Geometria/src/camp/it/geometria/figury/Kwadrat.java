package camp.it.geometria.figury;

public class Kwadrat extends Figura {




    @Override
      public String nazwa() {
        return "Kwadrat";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return (4 * figura[i][0]);
    }

    @Override
    public double pole(int[][] figura, int i) {
        return figura[i][0]*figura[i][1];
    }
}
