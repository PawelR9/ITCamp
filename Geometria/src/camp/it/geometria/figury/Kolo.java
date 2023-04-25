package camp.it.geometria.figury;

public class Kolo extends Figura{




    @Override
    public String nazwa() {
        return "Ko³o";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return 2 * Math.PI * (figura[i][0]);
    }

    @Override
    public double pole(int[][] figura, int i) {
        return Math.PI * Math.pow(figura[i][0], 2);
    }


}
