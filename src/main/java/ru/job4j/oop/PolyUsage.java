package ru.job4j.oop;

public class PolyUsage {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Airplane(), new Train(), new Bus()};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
