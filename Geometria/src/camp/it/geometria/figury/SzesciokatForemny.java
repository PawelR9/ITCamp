package camp.it.geometria.figury;

public class SzesciokatForemny extends Figura{


    @Override
    public String nazwa() {
        return "Szeœciok¹t foremny";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return 6 * figura[i][0];
    }

    @Override
    public double pole(int[][] figura, int i) {
        return (3*Math.pow(figura[i][0], 2) * Math.sqrt(3)) / 2;
    }

    public void obliczSzesciokatForemny(int[][] figura, int i) {
        System.out.println(nazwa());
        System.out.println("Obwód: " + obwod(figura, i));
        System.out.println("Pole powierzchni: " + pole(figura, i));
        System.out.println();
    }
}
