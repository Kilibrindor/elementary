package ru.job4j;

public class Main {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.pow((x2 - x1) + (y2 - y1), 2);
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(distance(1, 1, 3, 4)));

    }
}