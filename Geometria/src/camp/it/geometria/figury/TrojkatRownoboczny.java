package camp.it.geometria.figury;

public class TrojkatRownoboczny extends Figura {

    @Override
    public String nazwa() {
        return "Trójk¹t Równoboczny";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return 3 * figura[i][0];
    }

    @Override
    public double pole(int[][] figura, int i) {
        return (Math.pow(figura[i][0], 2) * Math.sqrt(3)) / 4;
    }

    public void obliczTrojkatRownoboczny(int[][] figura, int i) {
        System.out.println(nazwa());
        System.out.println("Obwód: " + obwod(figura, i));
        System.out.println("Pole powierzchni: " + pole(figura, i));
        System.out.println();
    }
}
