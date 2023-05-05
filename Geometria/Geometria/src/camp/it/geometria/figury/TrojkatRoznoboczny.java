package camp.it.geometria.figury;

public class TrojkatRoznoboczny extends Figura {


    @Override
    public String nazwa() {
        return "Trójk¹t Ró¿noboczny";
    }

    @Override
    public double obwod(int[][] figura, int i) {
        return figura[i][0] + figura[i][1] + figura[i][2];
    }

    @Override
    public double pole(int[][] figura, int i) {
        double polowaObwodu = obwod(figura, i) / 2;
        return Math.sqrt(polowaObwodu *
                (polowaObwodu - figura[i][0]) *
                (polowaObwodu - figura[i][1]) *
                (polowaObwodu - figura[i][2]));
    }

    public void obliczTrojkatRoznoboczny(int[][] figura, int i) {
        System.out.println(nazwa());
        System.out.println("Obwód: " + obwod(figura, i));
        System.out.println("Pole powierzchni: " + pole(figura, i));
        System.out.println();
    }

}
