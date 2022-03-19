package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {

        float euro = Converter.rubleToEuro(210);
        System.out.println("210 рублей равны " + euro + " евро");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 рублей равны " + dollar + " доллара");
    }
}
