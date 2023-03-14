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
            int remains = count - matches;
            if (1 <= matches && matches <= 3) {
                if (remains >= 0) {
                    count -= matches;
                    if (remains == 0) {
                        System.out.println("Этот игрок победил");
                    } else {
                        turn = !turn;
                    }
                } else {
                    System.out.println("Введенное число больше остатка");
                    System.out.println("Введите число повторно");
                }
            } else {
                System.out.println("Введенное число не соответствует условию");
                System.out.println("Введите число повторно");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
