package camp.it.bmi.calculator.db;

public class Database {
    private double[] db = new double[10000];

    public double getDb(int id) {
        return db[id];
    }

    public void adToDb(int id, double BMI) {
        db[id] = BMI;
    }
}

