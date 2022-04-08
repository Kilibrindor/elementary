package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int iq;

    public Engineer(String name, String surname, String education, String birthday, int iq) {
        super(name, surname, education, birthday);
        this.iq = iq;
    }

    public void education() {

    }
}
