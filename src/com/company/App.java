package com.company;


import java.util.Scanner;

class App {
    public void run(){
        System.out.println("--- Перевертыш ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово, которое хотите перевернуть: ");
        String str = scanner.nextLine();
        System.out.println("В этой строке " + str.length() + " символов");
        char[] chStr = str.toCharArray();
        char[] reverseStr = new char[chStr.length];
        for (int i = 0; i < reverseStr.length; i++) {
            reverseStr[i] = chStr[reverseStr.length - 1 - i];
        }
        String rStr = reverseStr.toString();
        System.out.println("Обратная строка: " + new String(reverseStr));
        System.out.println("Второе слово в строке: ");
        int firstSpace = str.indexOf(" ");
        String str2 = str.substring(firstSpace + 1);
        int nextSpace = str2.indexOf(" ");
        String secondWord = "";
        if (nextSpace > 0) {
            secondWord = str.substring(firstSpace + 1, nextSpace + firstSpace + 1);
        }else {
            secondWord = str2;
        }
        System.out.println(secondWord);
    }
}
