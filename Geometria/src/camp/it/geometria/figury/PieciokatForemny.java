package camp.it.geometria.figury;

public class PieciokatForemny extends Figura{


    @Override
    public String nazwa() {
        return "Pi�ciok�t foremny";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return 5 * figura[i][0];
    }

    @Override
    public double pole(int[][] figura, int i) {
        return (Math.pow(figura[i][0], 2) / 4) * Math.sqrt(25 + (10*Math.sqrt(5)));
    }
}
