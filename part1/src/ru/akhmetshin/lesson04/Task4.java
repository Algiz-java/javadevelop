package ru.akhmetshin.lesson04;

import java.io.PrintStream;
import java.util.Scanner;

public class Task4 {
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        System.out.print("Введите начальное число, знаменатель прогресси и количество чисел:");
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        double c=in.nextInt();
        double b=in.nextInt();
        int x=in.nextInt();
        double[] a = new double[x];
        System.out.println(ANSI_YELLOW + "Арифметическая прогрессия числа " + c + " с знаменателем " + b + ANSI_RESET);
        for (int i=0; i<a.length; i++){
            a[i]= c + b * i;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(ANSI_YELLOW + "Геометрическая прогрессия числа " + c + " с знаменателем " + b + ANSI_RESET);
        System.out.print(c + " ");
        for (int i=1; i<a.length; i++){
            a[i] = a[i-1] * b;
            System.out.print(a[i] + " ");
        }
    }
}
