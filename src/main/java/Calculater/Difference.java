package Calculater;

public class Difference extends FieldsOfCalculater {

    public Difference() {
    }

    public Difference(double a, double b) {
        super(a, b);
    }

    public double getDifference() {
        return getA() - getB();
    }

    public double getResultOfDifference(){
        System.out.printf("Result = %.4f", getDifference());
        return 0;
    }
}
