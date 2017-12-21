package Calculater;

public class Division extends FieldsOfCalculater {
    public Division(){}
    public Division(double a, double b) {
        super(a, b);
    }

    public double getDivision() {
        return getA() / getB();
    }

    public double getResultOfDivision(){
        System.out.printf("Result = %.4f", getDivision());
        return 0;
    }
}
