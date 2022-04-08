package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int strength;

    public Dentist(String name, String surname, String education, String birthday, int experience, int strength) {
        super(name, surname, education, birthday, experience);
        this.strength = strength;
    }

    public void removal(Tooth tooth) {

    }
}
