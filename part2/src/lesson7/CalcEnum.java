package lesson7;

import java.util.Scanner;

class CalcEnum {
    private int count = 1;
    private int summa;
    void check() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер желаемого напитка: ");
        int sel = in.nextInt() - 1;
        if (sel < CoffeeEnum.values().length & sel >= 0) {//compared with the amount of parameters in the CoffeeEnum
            System.out.print("Введите сумму: ");
            int cash = in.nextInt();
            if (cash > 0) {
                System.out.println("Вы выбрали " + CoffeeEnum.values()[sel].getType() + " к оплате " + CoffeeEnum.values()[sel].getPrice());
                while (true) {
                    if (cash >= CoffeeEnum.values()[sel].getPrice()) {
                        System.out.println("Ваш заказ готов");
                        if (cash > CoffeeEnum.values()[sel].getPrice()) {
                            System.out.println("Ваша сдача " + (cash - CoffeeEnum.values()[sel].getPrice()));
                        }
                        count++;
                        break;
                    } else {
                        System.out.print("Недостаточно средств, внесите еще " + (CoffeeEnum.values()[sel].getPrice() - cash) + ": ");
                        int newCash = in.nextInt();
                        cash += newCash;
                    }
                }
                summa += CoffeeEnum.values()[sel].getPrice();
            }else System.out.println("Введено отрицательное число");
        }else System.out.println("Не правильный ввод");
    }

    int getCount() {
        return count;
    }

    int getSumma() {
        return summa;
    }
}
