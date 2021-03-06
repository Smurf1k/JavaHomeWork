package com.pb.boichuk.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = scanner.nextInt();
        int[] array = new int[x];
        int len = array.length;
        int sum = 0;
        int sumPos = 0;

        System.out.println("Введите " + x + " значений массива: ");
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Введенный массив: ");
        for (int j : array) {
            System.out.print("[" + j + "] ");
        }

        // Сортировка
        boolean Sorted = false;
        while (!Sorted) {
            Sorted = true;
            for (int i = 1; i < len; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    Sorted = false;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.println("\nОтсортированный массив: ");
        for (int j : array) {
            System.out.print("[" + j + "] ");
        }

        // Подсчет суммы значений массива
        for(int i=0; i < x; i++){
            sum = sum + array[i];
        }
        System.out.println("\nСумарное значение массива: " + sum);
        System.out.println("Положительные числа: ");
        for (int i = 0; i < x; i++) {
            if (array[i] > 0) {
                System.out.print("[" + array[i] + "] ");
                sumPos = sumPos + 1;
            }
        }
        System.out.println("\nВсего положительных элементов: " + sumPos);
    }
}
