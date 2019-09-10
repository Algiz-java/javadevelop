package ru.akhmetshin.lesson01;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        float x = (float) (i - (i * 0.13));
        System.out.println("Ваша ЗП с вычетом НДФЛ 13% = " + x + " руб.");
    }
}
