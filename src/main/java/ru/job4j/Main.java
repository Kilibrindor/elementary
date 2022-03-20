package ru.job4j;

public class Main {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.pow((x2 - x1) + (y2 - y1), 2);
    }

    public static void main(String[] args) {
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);

    }
}