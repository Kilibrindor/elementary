package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("Super mario".equalsIgnoreCase(name)) {
            System.out.println("Start - super mario");
        }
        if ("Tanks".equalsIgnoreCase(name)) {
            System.out.println("Tanks - start");
        }
        if ("Tetris".equalsIgnoreCase(name)) {
            System.out.println("Tetris - start");
        }
    }

    public static void main(String[] args) {
        Game.menu("tetris");
    }
}
