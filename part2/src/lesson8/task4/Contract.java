package lesson8.task4;

import java.util.Arrays;
import java.util.Scanner;

class Contract {

    private String[] tovar = new String[2];
    private String numb;

    void contract() {
        System.out.print("Номер договора: ");
        Scanner in = new Scanner(System.in);
        numb = in.next();
        System.out.println("Введите наименование товаров:");
        for (int j = 0; j < 2; j++) {
            System.out.print((j + 1) + ". ");
            tovar[j] = in.next();
        }
    }
    String getTovar() {//как передать данные?
        System.out.println("Акт № " + numb);
        System.out.println("Приняты товары:");
        return Arrays.toString(tovar.clone());
    }
}
