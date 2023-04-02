package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Нажатие на педаль газа механически открывает дроссельную заслонку");
    }

    @Override
    public void passenger(int numberPassenger) {
        System.out.println("В автобусе едут " + numberPassenger + " пассажиров");
    }

    @Override
    public double refill(int fuel) {
        double price = fuel * priseOneLiter;
        System.out.println("Стомиость заправки автобуса составляет " + price + " рублей");
        return price;
    }
}
