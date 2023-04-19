package camp.it.bmi.calculator.db;

public class Database {
    private double[] db = new double[10000];
    private double[] hTab = new double[10000];
    private double[] wTab = new double[10000];


    public double getDb(int id) {
        return db[id];
    }

    public void addToDb(int id, double BMI) {
        db[id] = BMI;
    }

    public void addToHTab(int id, double height) {
        hTab[id] = height;
    }

    public void addToWTab(int id, double weight) {
        wTab[id] = weight;
    }

    public double getH(int id) {
        return hTab[id];
    }

    public double getW(int id) {
        return wTab[id];
    }
}

