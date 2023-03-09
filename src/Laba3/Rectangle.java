package Laba3;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException();

        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0)
            throw new IllegalArgumentException();
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (a <= 0)
            throw new IllegalArgumentException();

        this.b = b;
    }
}