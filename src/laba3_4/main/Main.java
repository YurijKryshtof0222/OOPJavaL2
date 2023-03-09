package laba3_4.main;

import laba3_4.Rectangle;
import laba3_4.Shape;
import laba3_4.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Shape rectangle, triangle;

            System.out.print("Введіть значення довжини та ширини прямокутника(вводити через пробіл): ");
            rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());

            System.out.print("Введіть значення двох катетів трикутника(вводити через пробіл): ");
            triangle = new Triangle(sc.nextDouble(), sc.nextDouble());

            sc.close();
            System.out.printf("Площа прямокутника: %.2f%n", rectangle.getArea());
            System.out.printf("Площа трикутника: %.2f%n", triangle.getArea());
            System.out.printf("Периметр прямокутника: %.2f%n", rectangle.getPerimeter());
            System.out.printf("Периметр трикутника: %.2f%n", triangle.getPerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: Сторони фігур не можуть набувати від'ємного значення!");
        }
    }

}
