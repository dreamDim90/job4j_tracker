package ru.job4j.poly;

public interface Transport {
    void drive();

    void passenger(int numberPassenger);

    double refill(int fuel);
        double priseOneLiter = 60.7;
}
