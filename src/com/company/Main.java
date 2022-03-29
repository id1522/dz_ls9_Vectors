package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector2d v1 = new Vector2d(5.0, 6.0);
        Vector2d v2 = new Vector2d(2.0, 3.0);
        Vector3d v3 = new Vector3d(5.0, 6.0, 3.0);
        Vector3d v4 = new Vector3d(2.0, 3.0, 4.0);
        System.out.println("Vector2d 1 " + v1);
        System.out.println("Vector2d 2 " + v2);
        System.out.println("Vector2d 1 Length " + v1.calculateLength());
        System.out.println("Vector2d 2 Length " + v2.calculateLength());
        System.out.println("Vector2d  Scalar " + v1.calculateDotProduct(v2));
        System.out.println("Vector2d  Sum " + v1.calculateSum(v2));
        System.out.println("Vector2d  Diff " + v1.calculateDifference(v2));
        System.out.println("Vector2d compareTo v1 and v2 " + v1.compareTo(v2));
        System.out.println("Created Vectors " + Arrays.toString(Vector2d.createVectors(4)));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Vector3d 3 " + v3);
        System.out.println("Vector3d 4 " + v4);
        System.out.println("Vector3d 3 Length " + v3.calculateLength());
        System.out.println("Vector3d 4 Length " + v4.calculateLength());
        System.out.println("Vector3d  Scalar " + v3.calculateDotProduct(v4));
        System.out.println("Vector3d  Sum " + v3.calculateSum(v4));
        System.out.println("Vector3d  Diff " + v3.calculateDifference(v4));
        System.out.println("Vector3d compareTo v3 and v4 " + v3.compareTo(v4));
        System.out.println("Created Vectors3d " + Arrays.toString(Vector3d.createVectors(4)));


    }
}









