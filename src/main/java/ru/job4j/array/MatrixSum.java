package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] arr : array) {
            for (int num : arr) {
                sum += num;
            }
        }
        return sum;
    }
}
