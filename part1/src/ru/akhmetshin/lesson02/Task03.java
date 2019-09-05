package ru.akhmetshin.lesson02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите секунды: ");
        int sec = in.nextInt();
        if (sec <= 86399) {
            int h = sec / 3600;
            int m = (sec - h * 3600) / 60;
            int s = sec - (h * 3600 + m * 60);
            System.out.println("Время в формате часов: " + h + "ч." + m + "мин." + s + "сек.");
        }

        if (sec >= 86400) {
            int d = sec / 86400;
            int h = (sec - d * 86400) / 3600;
            int m = (sec - (d * 86400 + h * 3600)) / 60;
            int s = sec - (d * 86400 + h * 3600 + m * 60);
            System.out.println("Время в формате часов: " +d + "д." + h + "ч." + m + "мин." + s + "сек.");
        }
    }
}
