package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] array) {
        boolean result = true;
        for (boolean j : array) {
            if (array[0] != j) {
                result = false;
                break;
            }
        }
        return result;
    }
}
