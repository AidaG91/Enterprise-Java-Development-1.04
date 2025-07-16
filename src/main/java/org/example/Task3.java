package org.example;

public class Task3 {
    public static double calculateMath(double x, double y) {

        double primero = Math.pow(x, 2);
        double intermedio = (4 * y) / 5 - x;
        double segundo = Math.pow(intermedio, 2);

        return primero + segundo;
    }
}