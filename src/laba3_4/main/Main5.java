package laba3_4.main;

import laba3_4.*;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width and height of Rectangle(through space): ");

        Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        AbleToCalcPerimeter atcp = rectangle;
        System.out.printf("Perimeter of Rectangle = %.2f%n", atcp.getPerimeter());
        AbleToCalcArea atca = rectangle;
        System.out.printf("Area of Rectangle = %.2f%n", atca.getArea());

        System.out.print("Enter width and height of Triangle(through space): ");

        Shape shape = new Triangle(sc.nextDouble(), sc.nextDouble());
        System.out.printf("Perimeter of Triangle: %.2f%n", shape.getPerimeter());
        System.out.printf("Area of Triangle = %.2f%n", shape.getArea());
        sc.close();
    }
}
