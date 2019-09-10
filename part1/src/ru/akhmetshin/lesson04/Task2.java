package ru.akhmetshin.lesson04;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        double x = in.nextDouble();
        System.out.print("Это число: ");
        if (x == 0){System.out.print("нулевое."); System.exit(0);}

        if (x < 0){System.out.print("отрицательное, ");} else System.out.print("положительное, ");

        if ((x - Math.floor(x)) == 0){
            System.out.print("целое, ");
            if ((x % 2) == 0){
                System.out.print("четное.");
            }else System.out.print("нечетное.");
        }

        if ((x - Math.floor(x)) > 0){
            System.out.print("дробное.");
        }
    }
}
