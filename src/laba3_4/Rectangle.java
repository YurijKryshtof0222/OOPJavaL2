package laba3_4;

import java.util.Objects;

public class Rectangle extends Shape {
    private double a;
    private double b;

    {
        a = 1;
        a = 1;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
