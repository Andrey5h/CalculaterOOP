package Calculater;

public class Sum extends FieldsOfCalculater {
    public Sum(){}
    public Sum(double a, double b) {
        super(a, b);
    }
    public double getSum(){
        return getA() + getB();
    }
}
