package laba3_4;

public class Triangle implements Shape {
    private double c;
    private double d;

    {
        c = 8;
        d = 6;
    }

    public Triangle() {}

    public Triangle(double c) {
        this(c, c);
    }

    public Triangle(double c, double d) {
        validate(c, d);

        this.c = c;
        this.d = d;
    }

    protected void validate(double... args) {
        for (double d: args) {
            if (d <= 0)
                throw new IllegalArgumentException("Number cannot be negative or equal to zero!");
        }
    }

    public double hypotenuse() {
        return Math.sqrt(c*c + d*d);
    }

    @Override
    public double getPerimeter() {
        return c + d + hypotenuse();
    }

    @Override
    public double getArea() {
        return c * d / 2;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        validate(c);

        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        validate(d);

        this.d = d;
    }
}
