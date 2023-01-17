package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        System.out.println("неизвестное слово " + eng);
        return eng;
    }

    public static void main(String[] args) {
        DummyDic k = new DummyDic();
        String i = "hellow";
        k.engToRus(i);
    }
}
