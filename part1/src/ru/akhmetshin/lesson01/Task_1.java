package ru.akhmetshin.lesson01;


public class Task_1 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("Стоимость 1 литра бензина " + y);
        System.out.println("Стоимость " + i + " литров равна " + i*y);
    }
}
