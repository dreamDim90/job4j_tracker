package ru.job4j.cast;

public class Train implements Vehicle {
    public void move() {
        System.out.println("Ускоряемся по путям до 100 кмч");
    }

    public void brake() {
        System.out.println("экстренное торможение до 0 кмч");
    }
}
