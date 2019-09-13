package ru.akhmetshin.lesson04;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) throws ParseException { //не совсем понятно пока что это, IDE добавил сам код
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        NumberFormat nf_in = NumberFormat.getNumberInstance(Locale.ENGLISH);
        double x = nf_in.parse(in.next()).doubleValue();
        System.out.print("Это число: ");
        if (x == 0){System.out.print("нулевое."); System.exit(0);}

        //if (x < 0){System.out.print("отрицательное, ");} else System.out.print("положительное, ");
        System.out.print((x < 0) ? "отрицательное, " : "положительное, ");

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
