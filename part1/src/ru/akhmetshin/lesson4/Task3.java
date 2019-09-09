package ru.akhmetshin.lesson4;


import java.util.Formatter;

public class Task3 {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("%28s", "Таблица умножения");
        System.out.println(ANSI_GREEN + fmt + ANSI_RESET);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + " " + "\t");
            }
            System.out.println();
        }
    }
}
