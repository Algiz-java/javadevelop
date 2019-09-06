package ru.akhmetshin.lesson03;

import java.util.Random;
import java.util.Scanner;

public class GameHotCold {
    public static void main(String[] args) {
        Random num = new Random();
        int x = num.nextInt(100);
        //System.out.println(x);
        System.out.println("Угадай число от 1 до 100, у тебя есть 3 попытки");
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 4; i++){
            System.out.print("Введите число, попытка № " + i + ":");
            int y = in.nextInt();
            int diff = x - y;
            if (Math.abs(diff) <= 5){
                System.out.println("Горячо!");
                System.exit(0);
            }else System.out.println("Холодно!");
        }
    }
}
