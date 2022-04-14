package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Жжжжж - жжжж - жжж");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Число пассажиров в автобусе : " + count);
    }

    @Override
    public double refuel(double value) {
        return value * 46.60;
    }
}
