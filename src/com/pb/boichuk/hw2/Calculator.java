package com.pb.boichuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2;
        String symbol;

        operand1 = scan.nextInt();
        operand2 = scan.nextInt();
        symbol = scan.next();

        System.out.println("x = " + operand1 + " symbol = " + symbol + " y = " + operand2);

    }


}
