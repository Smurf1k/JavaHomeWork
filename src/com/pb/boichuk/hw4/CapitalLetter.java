package com.pb.boichuk.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введи свою строку: ");
        String str = in.nextLine();

        String words[]=str.split("\\s");
        String capitalStr="";

        for(String word : words){
            String firstLetter=word.substring(0,1);
            String remainingLetters=word.substring(1);
            capitalStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }

        System.out.println("Введенная вами строка: ");
        System.out.println("> " + str);
        System.out.println("Строка с верхним регистром: ");
        System.out.println("> " + capitalStr);
        in.close();
    }
}
