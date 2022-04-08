package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education, String birthday, String language, int iq) {
        super(name, surname, education, birthday, iq);
        this.language = language;
    }

    public Programm coding() {
        return new Programm();
    }
}
