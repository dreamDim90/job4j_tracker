package ru.job4j.poly;

public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.drive();
        bus.passenger(5);
        bus.refill(100);
    }
}
