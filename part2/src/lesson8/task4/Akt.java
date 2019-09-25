package lesson8.task4;

import java.util.Arrays;

class Akt {
    private static String numb = Convert.numb();
    private static String date = Convert.date();
    private static String[] tovar = Convert.tovar();

    static void akt(){
        System.out.println("Акт № " + numb);
        System.out.println("дата: " + date);
        System.out.println("Наименование товаров: " + Arrays.toString(Convert.tovar()));
    }
}
