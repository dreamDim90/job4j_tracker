package ru.job4j.cast;

public class Plane implements Vehicle {
    public void move() {
        System.out.println("Ускоряемся в небе до 500 кмч");
    }

    public void brake() {
        System.out.println("тормозим реверсом до 200 кмч");
    }
}
