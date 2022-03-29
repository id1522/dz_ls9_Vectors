package com.company;
import java.util.Vector;
public class Main {

    public static void main(String[] args) {
        Vector a = new Vector(13, 25, 4);
        Vector b = new Vector(43, -7, 11);

        ViewResult.showScalarResult(a.scalarProduct(b));
        ViewResult.showVectorResult(a.vectorProduct(b));
    }
}

class ViewResult{
    public static void showVectorResult(double[] result) {
        System.out.print("Векторное произведение векторов:[a,b]=<");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != 2 ? ";" : ">\n"));
        }
    }

    public static void showScalarResult(double d) {
        System.out.println("Скалярное произведение векторов: " + d);
    }
}








