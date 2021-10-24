package com.pb.boichuk.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        char sign;
        int operand1, operand2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        operand1 = input.nextInt();

        System.out.println("Выберите знак: +, -, *, или /");
        sign = input.next().charAt(0);

        System.out.println("Введите второе число");
        operand2 = input.nextInt();

        switch (sign) {

            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;

            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;

            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;

            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println(operand1 + " / " + operand2 + " = " + result);
                } else
                    System.out.println("На ноль делить некрасиво! :/");
                break;

            default:
                System.out.println("Некорректный знак!");
                break;
        }

        input.close();
    }
}