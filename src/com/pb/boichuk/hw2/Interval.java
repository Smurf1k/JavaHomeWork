package com.pb.boichuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("> Input a number: ");
        int Var = in.nextInt();
        System.out.printf("Your number: %d \n", Var);

        if (Var >=0 && Var <=14) {
            System.out.printf(" Result: %d is [0-14]\n", Var);
        } else if (Var >=15 && Var <=35) {
            System.out.printf(" Result: %d is [15-35]\n", Var);
        } else if (Var >=36 && Var <=50) {
            System.out.printf(" Result: %d is [36-50]\n", Var);
        } else if (Var >=51 && Var <=100) {
            System.out.printf(" Result: %d is [51-100]\n", Var);
        } else
            System.out.printf(" Result: %d isn't [0-100]\n", Var);

        in.close();
    }
}
