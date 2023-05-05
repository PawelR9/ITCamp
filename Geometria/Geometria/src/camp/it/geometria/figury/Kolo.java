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

    public void obliczKolo(int[][] figura, int i) {
        System.out.println(nazwa());
        System.out.println("Obwód: " + obwod(figura, i));
        System.out.println("Pole powierzchni: " + pole(figura, i));
        System.out.println();
    }


}
