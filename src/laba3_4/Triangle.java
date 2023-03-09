package laba3_4;

import java.util.Objects;

public class Triangle implements Shape {
    private double c;
    private double d;
    private double hypotenuse;

    {
        c = 8;
        d = 6;

        updateHypotenuse();
    }

    public Triangle() {}

    public Triangle(double c) {
        this(c, c);
    }

    public Triangle(double c, double d) {
        validateArgs(c, d);

        this.c = c;
        this.d = d;
        updateHypotenuse();
    }

    public static boolean isTriangleRight(double c, double d, double h) {
        return h == new Triangle(c, d).hypotenuse;
    }

    private void updateHypotenuse() {
        hypotenuse = Math.sqrt(c*c + d*d);
    }

    protected void validateArgs(double... args) {
        for (double d: args) {
            if (d <= 0)
                throw new IllegalArgumentException("Number cannot be negative or equal to zero!");
        }
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double getPerimeter() {
        return c + d + getHypotenuse();
    }

    @Override
    public double getArea() {
        return c * d / 2;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        validateArgs(c);

        this.c = c;
        updateHypotenuse();
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        validateArgs(d);

        this.d = d;
        updateHypotenuse();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.c, c) == 0 && Double.compare(triangle.d, d) == 0 && Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c, d, hypotenuse);
    }
}