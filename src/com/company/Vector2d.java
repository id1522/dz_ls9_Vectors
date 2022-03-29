package com.company;

import java.util.Random;


public class Vector2d {
    private double x;
    private double y;
    public static final String DESCRIPTION = "\nЭто вектор для 2d системы координат";

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2d() {
        this.x = 0;
        this.y = 0;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double calculateDotProduct(Vector2d vector2d) {
        return x * vector2d.getX() + y * vector2d.getY();
    }

    public Vector2d calculateSum(Vector2d vector2d) {
        return new Vector2d(x + vector2d.getX(), y + vector2d.getY());
    }

    public Vector2d calculateDifference(Vector2d vector2d) {
        return new Vector2d(x - vector2d.getX(), y - vector2d.getY());
    }

    public int compareTo(Vector2d vector2d) {
        return (int) (this.calculateLength() - vector2d.calculateLength());
    }
    public java.lang.String toString() {
        return DESCRIPTION + ":\n Vector2d {" + " x=" + x + ", y=" + y + " }";
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static Vector2d[] createVectors(int n) {
        Random random = new Random();
        Vector2d[] vector2ds = new Vector2d[n];
        for (int i = 0; i < n; i++) {
            vector2ds[i] = new Vector2d(random.nextDouble(),
                    random.nextDouble());
        }
        return vector2ds;
    }


}




