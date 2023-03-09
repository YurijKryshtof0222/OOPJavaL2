package laba3_4.main;

import laba3_4.Rectangle;
import laba3_4.Triangle;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println(isTriangleRightToString(3, 4, 5));
        System.out.println(isTriangleRightToString(5, 7 , 9));
    }

    public static String isTriangleRightToString(double c, double d, double h) {
        return String.format("Трикутник з катетами %.2f, %.2f і гіпотенузою %.2f %sіснує!",
                c, d, h, Triangle.isTriangleRight(c, d, h) ? "не " : "");
    }
}
