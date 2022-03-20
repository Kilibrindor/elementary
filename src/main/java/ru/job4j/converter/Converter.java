package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {

        float in = 210;
        float expected = 3;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("210 rubles are 3. Test result : " + passed);
        float in1 = 120;
        float expected1 = 2;
        float out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
