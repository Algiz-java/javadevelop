package ru.akhmetshin.lesson02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.print("Введите тип бензина АИ - ");
            int num = in.nextInt(); //Тип бензина (АИ-80, 92, 95)
            if (count == 2) {
                System.out.println("Превышено количество попыток ввода, конец программы");
                System.exit(0);
            }
            if (num != 80 & num != 92 & num != 95 & count < 2) {
                System.out.println("Неправильный ввод, введите 80, 92 или 95");
                count = count + 1;
            }
            if (num == 80 | num == 92 | num == 95) {
                System.out.print("Введите количество литров - ");
                int val = in.nextInt(); //Количество литров
                float a = 40.35f, b = 43.51f, c = 45.62f, x; //объявление переменных с ценой и конечная стоимость
                if (num == 80) {
                    x = a * val;
                    System.out.println("Стоимость бензина = " + x + " руб.");
                }
                if (num == 92) {
                    x = b * val;
                    System.out.println("Стоимость бензина = " + x + " руб.");
                }
                if (num == 95) {
                    x = c * val;
                    System.out.println("Стоимость бензина = " + x + " руб.");
                }
                count = 4;
            }
        }
    }
}
