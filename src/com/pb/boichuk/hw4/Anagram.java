package com.pb.boichuk.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void isAnagram(String str1, String str2) {
        
        String atrS1 = str1.replaceAll("\\s", " ");
        String atrS2 = str2.replaceAll("\\s", " ");
        
        boolean status = true;
        
        if (atrS1.length() != atrS2.length()) {
            status = false;
        } else {
            char[] ArrayatrS1 = atrS1.toLowerCase().toCharArray();
            char[] ArrayatrS2 = atrS2.toLowerCase().toCharArray();
            Arrays.sort(ArrayatrS1);
            Arrays.sort(ArrayatrS2);
            status = Arrays.equals(ArrayatrS1, ArrayatrS2);
        }

        System.out.println("\n===[ НАЧАЛО ПРОВЕРКИ ]===\"");

        if (status) {
            System.out.println("\"" + atrS1 + "\"\nИ\n\"" + atrS2 + "\"\n...\n> АНАГРАМА.");
        } else {
            System.out.println("\"" + atrS1 + "\"\nИ\n\"" + atrS2 + "\"\n...\n> НЕ АНАГРАМА.");
        }

        System.out.println("===[ КОНЕЦ ПРОВЕРКИ ]===");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 строку: ");
        String str = in.nextLine();
        System.out.println("Введите 2 строку: ");
        String str2 = in.nextLine();

        isAnagram(str, str2);
    }
}
