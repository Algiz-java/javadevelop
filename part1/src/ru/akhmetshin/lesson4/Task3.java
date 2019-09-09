package ru.akhmetshin.lesson4;


public class Task3 {


    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                    System.out.print(j * i + " " + "\t");
            }
            System.out.println();
        }
    }
}
