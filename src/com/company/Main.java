package com.company;

import java.util.Scanner;

public class Main {


    public Main() {
    }

    @Override
    public String toString() {
        return "Main{}";
    }



    //comment


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
        countX(radius, height, triangle);
//        double x;
//        for (int i=0; i<triangle-1; i++) {
//        x=radius*Math.cos(2*3.14*i/triangle);
//            System.out.println("координата Х: " + x);
//        }


    }

    public static void countX(int radius, int height, int triangle) {
    //double degrees1 = 0.0;
    //double radians1 = Math.toRadians(degrees1);
    //    System.out.format("Синус %.1f градусов равен %.4f%n", radians1, Math.sin(radians1));
        int t;
        t=2;
        System.out.format("Синус просто %.4f%n", Math.sin(1.6));

};
}

