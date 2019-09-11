package ru.akhmetshin.lesson04;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        NumberFormat nf_in = NumberFormat.getNumberInstance(Locale.ENGLISH);
        double z = nf_in.parse(in.next()).doubleValue();
        System.out.print("Это число: ");
        if (z == 0){System.out.print("нулевое."); System.exit(0);}

        if (z < 0){System.out.print("отрицательное, ");} else System.out.print("положительное, ");

        if ((z - Math.floor(z)) == 0){
            System.out.print("целое, ");
            if ((z % 2) == 0){
                System.out.print("четное.");
            }else System.out.print("нечетное.");
        }

        if ((z - Math.floor(z)) > 0){
            System.out.print("дробное.");
        }
    }
}
