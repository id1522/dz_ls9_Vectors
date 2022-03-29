package com.company;

import java.util.Random;

public class Vector3d {
    private double x;
    private double y;
    private double z;
    public static final String DESCRIPTION1 = "\nЭто вектор для 3d системы координат";

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double calculateDotProduct(Vector3d vector3d) {
        return x * vector3d.getX() + y * vector3d.getY() + z * vector3d.getZ();
    }

    public Vector3d calculateSum(Vector3d vector3d) {
        return new Vector3d(x + vector3d.getX(), y + vector3d.getY(), z + vector3d.getZ());
    }

    public Vector3d calculateDifference(Vector3d vector3d) {
        return new Vector3d(x - vector3d.getX(), y - vector3d.getY(), z - vector3d.getZ());
    }

    public int compareTo(Vector3d vector3d) {
        return (int) (this.calculateLength() - vector3d.calculateLength());
    }

    public java.lang.String toString() {
        return DESCRIPTION1 + ": \nVector3d {" + " x=" + x + ", y=" + y + ", z=" + z + "}";
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static Vector3d[] createVectors(int n) {
        Random random = new Random();
        Vector3d[] vector3ds = new Vector3d[n];
        for (int i = 0; i < n; i++) {
            vector3ds[i] = new Vector3d(random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
        }
        return vector3ds;
    }
}
