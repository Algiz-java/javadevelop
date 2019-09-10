package ru.akhmetshin.lesson01;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int sec = Integer.parseInt(args[0]);
        System.out.print(sec + " секунд - это: ");
        if (sec <= 86399) {
            int h = sec / 3600;
            int m = (sec - h * 3600) / 60;
            int s = sec - (h * 3600 + m * 60);
            System.out.print(h + "ч." + m + "мин." + s + "сек.");
        }

        if (sec >= 86400) {
            int d = sec / 86400;
            int h = (sec - d * 86400) / 3600;
            int m = (sec - (d * 86400 + h * 3600)) / 60;
            int s = sec - (d * 86400 + h * 3600 + m * 60);
            System.out.print(d + "д." + h + "ч." + m + "мин." + s + "сек.");
        }
    }
}
