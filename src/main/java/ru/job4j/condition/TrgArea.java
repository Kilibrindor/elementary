package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - 2) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        System.out.println("Площадь треугольника равна " + area(2, 2, 2));
    }
}
