package Laba2;

public class Triangle implements Shape{
    private double c;
    private double d;

    public Triangle(double c, double d) {
        if (c <= 0 || d <= 0)
            throw new IllegalArgumentException();

        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        return c * d / 2;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c <= 0)
            throw new IllegalArgumentException();

        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        if (d <= 0)
            throw new IllegalArgumentException();

        this.d = d;
    }
}
