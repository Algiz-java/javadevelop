package ru.akhmetshin.lesson04;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random Number = new Random();
        int N1 = Number.nextInt();
        int N2 = Number.nextInt();
        System.out.println("Из двух чисел " + N1 + " и " + N2 + ", меньшее: " + Math.min(N1,N2));
    }
}
