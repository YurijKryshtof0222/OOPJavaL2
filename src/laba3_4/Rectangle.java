package laba3_4;

public class Rectangle implements Shape {
    private double a;
    private double b;

    {
        a = 8;
        a = 6;
    }

    public Rectangle() {}

    public Rectangle(double a) {
        this(a, a);
    }

    public Rectangle(double a, double b) {
        validate(a, b);

        this.a = a;
        this.b = b;
    }

    protected void validate(double... args) {
        for (double d: args) {
            if (d <= 0)
                throw new IllegalArgumentException();
        }
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2*a + 2*b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        validate(a);
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        validate(b);

        this.b = b;
    }
}
