package Calculater;

public class Sum extends FieldsOfCalculater {
    public Sum(){}
    public Sum(double a, double b) {
        super(a, b);
    }
    public double getSum(){
        return getA() + getB();
    }
    public double getResultOfSum(){
        System.out.printf("Result = %.4f", getSum());
        return 0;
    }
}
