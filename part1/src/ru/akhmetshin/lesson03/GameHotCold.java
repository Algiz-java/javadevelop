package ru.akhmetshin.lesson03;

import java.util.Random;
import java.util.Scanner;

public class GameHotCold {
    public static void main(String[] args) {
        Random num = new Random();
        int x = num.nextInt(100);
        System.out.println("Угадай загаданное число от 1 до 100!");
        Scanner in = new Scanner(System.in);
        boolean i = true;
        while (i){
            System.out.print("Введите число:");
            int y = in.nextInt();
            int diff = x - y;
            if (x == y){
                System.out.println("Конец игры, загаданное число: " + x);
                System.exit(0);
            }
            if (Math.abs(diff) <= 10) {
                System.out.print("Горячо :) " + "Хочешь продолжить игру, введи Y:");
                String button = in.next();
                i = button.equalsIgnoreCase("y");
            }
            if (Math.abs(diff) > 10) {
                System.out.print("Холодно :( " + "Хочешь продолжить игру, введи Y:");
                String button = in.next();
                i = button.equalsIgnoreCase("y");
            }
        }
        System.out.println("Конец игры, загаданное число: " + x);
    }
}
