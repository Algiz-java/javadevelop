package lesson14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

class CalcEnum {
    private static Logger logger = LoggerFactory.getLogger(CalcEnum.class);
    private int count = 1;
    private int summa;
    void check() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер желаемого напитка: ");
        int sel = in.nextInt() - 1;
            logger.info("Пользовтель выбрал напиток {}", sel);
        if (sel < CoffeeEnum.values().length & sel >= 0) {//compared with the amount of parameters in the CoffeeEnum
            System.out.print("Внесите деньги: ");
            int cash = in.nextInt();
            logger.info("Пользовтель внес деньги {}", cash);
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
                        logger.warn("Недостаточно средств на счету");
                        System.out.print("Недостаточно средств, внесите еще " + (CoffeeEnum.values()[sel].getPrice() - cash) + ": ");
                        int newCash = in.nextInt();
                        cash += newCash;
                        logger.info("Пользовтель внес деньги повторно {}", cash);
                    }
                }
                summa += CoffeeEnum.values()[sel].getPrice();
            }else {
                System.out.println("Введено отрицательное число");
                logger.error("Ошибка ввода {}", cash);
            }
        }else {
            System.out.println("Не правильный ввод");
            logger.error("Выбран не правильный напиток {}", sel);
        }
    }

    int getCount() {
        return count;
    }

    int getSumma() {
        return summa;
    }
}
