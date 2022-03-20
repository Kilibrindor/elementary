package ru.job4j.calculator;
import  static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractionAndDivide(double first, double second) {
        return subtraction(first, second) + divide(first, second);
    }

    public static double allSum(double first, double second) {
        return sumAndMultiply(first, second) + subtractionAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат счета равен " + allSum(10, 20));
    }
}
