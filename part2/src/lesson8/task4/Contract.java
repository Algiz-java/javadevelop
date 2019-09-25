package lesson8.task4;

import java.util.Scanner;

class Contract {

    private static String numb;
    private static String date;
    private static String[] tovar = {"Автомобиль", "Квартира"};

    static void contract() {
        System.out.print("Номер договора: ");
        Scanner in  = new Scanner(System.in);
        numb = in.next();
        System.out.print("Дата: ");
        date = in.next();

    }
    static String[] getTovar() {
        return tovar;
    }
    static String getNumb() {
        return numb;
    }
    static String getDate() {
        return date;
    }
}