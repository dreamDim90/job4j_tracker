package ru.job4j.tracker;

public class Stubinput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String qestion) {
        return 0;
    }
}
