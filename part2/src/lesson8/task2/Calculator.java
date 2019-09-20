package lesson8.task2;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        NumberFormat nf_in = NumberFormat.getNumberInstance(Locale.ENGLISH);
        double a = nf_in.parse(in.next()).doubleValue();
        System.out.print("Введите выражение: ");
        String z = in.next();
        switch (z){
            case "+":
                System.out.print("Введите второе число: ");
                double b = nf_in.parse(in.next()).doubleValue();
                plus(a, b);
                break;
            case "-":
                System.out.print("Введите второе число: ");
                double c = nf_in.parse(in.next()).doubleValue();
                minus(a, c);
                break;
            case "/":
                System.out.print("Введите второе число: ");
                double d = nf_in.parse(in.next()).doubleValue();
                div(a, d);
                break;
            case "*":
                System.out.print("Введите второе число: ");
                double e = nf_in.parse(in.next()).doubleValue();
                multi(a, e);
                break;
            case "%":
                System.out.print("Введите второе число: ");
                double f = nf_in.parse(in.next()).doubleValue();
                percent(a, f);
                break;
            default:
                System.out.println("Не верное выражение.");
                break;
        }

    }

    private static void plus(double in1, double in2) {
        double out = in1 + in2;
        System.out.println("Ответ: " + out);
    }

    private static void minus(double in1, double in2) {
        double out = in1 - in2;
        System.out.println("Ответ: " + out);
    }
    private static void div(double in1, double in2) {
        double out = in1 / in2;
        System.out.println("Ответ: " + out);
    }

    private static void multi(double in1, double in2) {
        double out = in1 + in2;
        System.out.println("Ответ: " + out);
    }

    private static void percent(double in1, double in2) {
        if (in2 < 100) {
            double out = in1 - (in1 * in2 / 100);
            System.out.println("Ответ: " + out);
        } else {
            double out = in1 + (in1 * in2 / 100);
            System.out.println("Ответ: " + out);
        }
    }
}
