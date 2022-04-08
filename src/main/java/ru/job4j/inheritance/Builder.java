package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String[] tools;

    public Builder(String name, String surname, String education, String birthday, String[] tools, int iq) {
        super(name, surname, education, birthday, iq);
        this.tools = tools;
    }

    public House build() {
        return new House();
    }
}
