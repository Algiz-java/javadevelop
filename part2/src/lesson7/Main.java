package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Coffee coffee = new Coffee();
        coffee.getSortCoffee();
        int v = 500;//объем бака с водой в мл
        int z = 0;//прибыль
        int j = v / 100;//сколько чашек кофе сможет выдать автомат с учетом что 1 кружка это 100мл
        for (int i = 0; i < j; i++) {
            System.out.print("Выберите напиток в формате A0: ");
            coffee.select = in.next();
            coffee.check();
            int[] summa = new int[j];
            summa[i] = coffee.z;
            z += summa[i];
            System.out.println(i);
        }
        System.out.println("Требуется заправить бак");
        System.out.println("Общая прибыль составила " + z + " руб.");
    }
}
