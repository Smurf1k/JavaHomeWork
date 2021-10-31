package com.pb.boichuk.hw4;

public class CapitalLetter {
    public static void replaceSpaceToDot() {
        String str = "1 000 000 000";
        //преобразовываем строку в массив
        char[] chArray = str.toCharArray();
        //перебираем все элементы массива
        for (int i = 0; i < chArray.length; i++) {
            //находим пробел
            if (chArray[i] == ' ') {
                //заменяем на точку
                chArray[i] = '.';

            }
        }
        //выводим результат
        System.out.println(chArray);
    }
}
