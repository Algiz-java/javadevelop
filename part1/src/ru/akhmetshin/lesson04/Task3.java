package ru.akhmetshin.lesson04;


import java.util.Scanner;

public class Task3 {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину таблицы: ");
        int x = in.nextInt(); //Есть ли функция считывания число после пробела, а не после клавиши Enter
        System.out.printf(ANSI_GREEN + "%52s", "Таблица умножения" + ANSI_RESET + "\n"); /* Как здесь можно отцентровать
        текст в зависимости от ширины таблицы умножения?*/
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.printf("%5s", j * i + " " + "\t");
            }
            System.out.println();
        }
    }
}
