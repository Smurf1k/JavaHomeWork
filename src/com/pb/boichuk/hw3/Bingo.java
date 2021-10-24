package com.pb.boichuk.hw3;

import java.util.Scanner;

public class  Bingo {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1000 + 1);
        int attempts = 1;

        System.out.println("===[ НАЧАЛО ИГРЫ ]===");
        System.out.println("Было загадано число (от 1 до 1000): ");
        System.out.println("Для досрочного завершения введите - \"0\".");

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("> ");
            int gessnumber = sc.nextInt();

            if (gessnumber >= 0 && gessnumber <= 1000) {
                if (gessnumber == 0) {
                    System.out.println("===[ ИГРА ОКОНЧЕНА ]===");
                    System.out.println("Вы досрочно завершили игру.");
                    System.out.println("Загаданое число было \"" + number + "\".");
                    System.out.println("===[ ИГРА ОКОНЧЕНА ]===");
                    break;
                }
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
            } else
                System.out.println("Принимаются значения от 0 до 100...");
        }
    }
}