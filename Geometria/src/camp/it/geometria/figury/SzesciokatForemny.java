package camp.it.geometria.figury;

public class SzesciokatForemny extends Figura{


    @Override
    public String nazwa() {
        return "Sze�ciok�t foremny";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return 6 * figura[i][0];
    }

    @Override
    public double pole(int[][] figura, int i) {
        return (3*Math.pow(figura[i][0], 2) * Math.sqrt(3)) / 2;
    }
}
