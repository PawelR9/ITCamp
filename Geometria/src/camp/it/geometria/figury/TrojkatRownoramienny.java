package camp.it.geometria.figury;

public class TrojkatRownoramienny extends Figura {


    @Override
    public String nazwa() {
        return "Trójk¹t równoramienny";
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
}
