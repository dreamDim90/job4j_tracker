package ru.job4j.cast;

public class Bus implements Vehicle {
    public void move() {
        System.out.println("Ускоряемся по шоссе до 40 кмч");
    }

    public void brake() {
        System.out.println("тормозим барабанным тормозом до 0 кмч");
    }
}
