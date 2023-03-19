package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || 3 < matches) {
                System.out.println("Введенное число не соответствует условию");
            } else if (matches > count) {
                System.out.println("Введенное число больше остатка");
                System.out.println("Остаток " + count + " спички");
            } else {
                count -= matches;
                turn = !turn;
                System.out.println("Осталось " + count + " спичек");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
