package Calculater;

public class Multiply extends FieldsOfCalculater {
    public Multiply(){}
    public Multiply(double a, double b) {
        super(a, b);
    }

    public double getMultiply() {
        return getA() * getB();
    }
}
