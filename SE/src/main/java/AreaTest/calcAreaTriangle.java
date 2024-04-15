package AreaTest;

public class calcAreaTriangle {
    public static double calcTriangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive numbers.");
        }
        return 0.5 * base * height;
    }
}

