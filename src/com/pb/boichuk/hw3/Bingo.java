package com.pb.boichuk.hw3;

import java.util.Scanner;

public class  Bingo {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100 + 1);
        int attempts = 1;

        System.out.println("===[ НАЧАЛО ИГРЫ ]===");
        System.out.println("Было загадано число (от 1 до 100): ");
        System.out.println("Для досрочного завершения введите - \"exit\".");

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("> ");

            int gessnumber = sc.nextInt();
            if (gessnumber > number) {
                System.out.println("Почти угадали! Попытайся уменьшить число...");
                attempts++;
            } else if (gessnumber < number) {
                System.out.println("Почти угадали! Попытайся увеличить число...");
                attempts++;
            } else {
                System.out.println("===[ ИГРА ОКОНЧЕНА ]===");
                System.out.println("Да! Это было число \"" + number + "\".");
                System.out.println("Кол-во попыток - " + attempts + ".");
                System.out.println("===[ ИГРА ОКОНЧЕНА ]===");
                break;
            }
            /*if (sc.equals("exit")) {
                break;
            }*/
            }
        }
    }
    /*
public class S04_GuessColor {
    // Циклическая конструкция - while.

    public static void main(String[] args) {
        System.out.println("Угадайте задуманный цвет с пяти попыток.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX_ATTEMPT = 5; // Допустимое количество попыток.
        int attempt = 0;           // Счетчик попыток.
        String color = "red";      // Задуманный цвет.
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;

            }

            if (!value.equals(color)) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");
    }
}
     */