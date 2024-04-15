package AreaTest;

public class calcAreaRectangle {
    public static double calcRectangleArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers.");
        }
        return length * width;
    }
}
