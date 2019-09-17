package lesson7;

import java.util.Scanner;

class CalcEnum {
    private String name;
    void check() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int cash = in.nextInt();
        System.out.print("Введите номер желаемого напитка: ");
        int sel = in.nextInt();
        switch (sel){
            case 1:
                name = "CUP";
                break;
            case 2:
                name = "LAT";
                break;
            case 3:
                name = "ESP";
                break;
            case 4:
                name = "MOK";
                break;
            case 5:
                name = "RAF";
                break;
            default:
                System.out.println("Не правильный ввод");
                System.out.println("Возврат средств " + cash);
                System.exit(0);
        }
        System.out.println("Вы выбрали " + CoffeeEnum.valueOf(name).getType() + " к оплате " + CoffeeEnum.valueOf(name).getPrice());
        while (true) {
            if (cash >= CoffeeEnum.valueOf(name).getPrice()) {
                System.out.println("Ваш заказ готов");
                if (cash > CoffeeEnum.valueOf(name).getPrice()) {
                    System.out.println("Ваша сдача " + (cash - CoffeeEnum.valueOf(name).getPrice()));
                }
                break;
            } else {
                System.out.print("Недостаточно средств, внесите еще " + (CoffeeEnum.valueOf(name).getPrice() - cash) + ": ");
                int newCash = in.nextInt();
                cash += newCash;
            }
        }
    }
}
