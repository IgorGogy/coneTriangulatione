package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус основания конуса: ");
        int radius = in.nextInt();
        System.out.print("Введите высоту конуса: ");
        int height = in.nextInt();
        System.out.print("Введите количество треуголных сегментов конуса: ");
        int triangle = in.nextInt();
        System.out.printf("Радиус: %s  высота: %s сегментов: %s  \n", radius, height, triangle);
        in.close();
        outputPoints((inputX(triangle, radius)), (inputY(triangle, radius)), inputZ(triangle, height));
    }

    private static void outputPoints(double[] inputX, double[] inputY, int[] inputZ) {
        System.out.println("Координаты точек:");
        for (int i = 0; i < inputX.length; i++) {
System.out.println(String.format(
 "P%d: (" + "x=%.2f;  " + "y=%.2f;  " + "z=%d) ", i, inputX[i], inputY[3], inputZ[i])); }
        System.out.println("Координаты точек треугольников:");
//System.out.println(String.format("Треугольник%d: (" + "x=%.2f;  " + "y=%.2f;  " + "z=%d) ", i,
    }

    public static double[] inputX(int triangle, int radius) {
        double[] arrayX = new double[triangle];
        for (int i = 0; i < triangle; i++) {
            arrayX[i] = countX(triangle, radius, i);
        }
        return arrayX;
    }

    public static double[] inputY(int triangle, int radius) {
        double[] arrayY = new double[triangle];
        for (int j = 0; j < triangle; j++) {
            arrayY[j] = countY(triangle, radius, j);
        }
        return arrayY;
    }
    public static int[] inputZ(int triangle, int height) {
        int[] arrayZ = new int[triangle];
        for (int k = 0; k < triangle; k++) {
            arrayZ[k] = countZ(triangle, height, k);
        }
        return arrayZ;
    }

    public static double countX(int triangle, int radius, int i) {
        double x = 0;
        x = radius * Math.cos(6.28318531 * i / triangle);
        return x;
    }

    public static double countY(int triangle, int radius, int i) {
        double y = 0;
        y = radius * Math.sin(6.28318531 * i / triangle);
        return y;
    }

    public static int countZ(int triangle, int height, int i) {
        int z = 0;
        z = height;
        return z;
    }
}


