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

public void obliczKwadrat(int[][] figura, int i) {
    System.out.println(nazwa());
    System.out.println("Obwód: " + obwod(figura, i));
    System.out.println("Pole powierzchni: " + pole(figura, i));
    System.out.println();
}

}
