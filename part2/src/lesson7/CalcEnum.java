package lesson7;

import java.util.Scanner;

class CalcEnum {
    void different() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму : ");
        int cash = in.nextInt();
        while (true) {
            if ((cash >= CoffeeEnum.Cup.getPrice()) | (cash >= CoffeeEnum.Lat.getPrice())
                    | (cash >= CoffeeEnum.Exp.getPrice()) | (cash >= CoffeeEnum.Mok.getPrice())) {
                System.out.print("Вы внесли " + cash + ", введите номер желаемого напитка: ");
                int sel = in.nextInt();
                switch (sel) {
                    case 1:
                        getCashCup(in, cash);
                        break;
                    case 2:
                        getCashLat(in, cash);
                        break;
                    case 3:
                        getCashExp(in, cash);
                        break;
                    case 4:
                        getCashMok(in, cash);
                        break;
                    default:
                        System.out.println("Не правильный ввод");
                        System.out.println("Заберите деньги: " + cash);
                        break;
                }break;
            }
            System.out.print("Недостаточно средств, внесите еще минимум "
                    + (Math.min(Math.min(CoffeeEnum.Cup.getPrice(), CoffeeEnum.Lat.getPrice()),
                    Math.min(CoffeeEnum.Exp.getPrice(), CoffeeEnum.Mok.getPrice())) - cash) + ": ");
            int newCash = in.nextInt();
            cash += newCash;
        }
    }

    private void getCashCup(Scanner in, int cashCup) {
        while (true) {
            if (cashCup >= CoffeeEnum.Cup.getPrice()) {
                System.out.println("Вы выбрали " + CoffeeEnum.Cup.getType() + ", цена " + CoffeeEnum.Cup.getPrice());
                System.out.println("Ваша сдача " + Math.abs(cashCup - CoffeeEnum.Cup.getPrice()));
                break;
            } else {
                System.out.print("Недостаточно средств, внесите еще " + (CoffeeEnum.Cup.getPrice() - cashCup) + ": ");
                int newCash = in.nextInt();
                cashCup += newCash;
            }
        }
    }
    private void getCashLat(Scanner on, int cashLat) {
        while (true) {
            if (cashLat >= CoffeeEnum.Lat.getPrice()) {
                System.out.println("Возьмите свой " + CoffeeEnum.Lat.getType() + ", цена " + CoffeeEnum.Lat.getPrice());
                System.out.println("Ваша сдача " + Math.abs(cashLat - CoffeeEnum.Lat.getPrice()));
                break;
            } else {
                System.out.print("Недостаточно средств, внесите еще " + (CoffeeEnum.Lat.getPrice() - cashLat) + ": ");
                int newCash = on.nextInt();
                cashLat += newCash;
            }
        }
    }
    private void getCashExp(Scanner on, int cashExp) {
        while (true) {
            if (cashExp >= CoffeeEnum.Exp.getPrice()) {
                System.out.println("Возьмите свой " + CoffeeEnum.Exp.getType() + ", цена " + CoffeeEnum.Exp.getPrice());
                System.out.println("Ваша сдача " + Math.abs(cashExp - CoffeeEnum.Exp.getPrice()));
                break;
            } else {
                System.out.print("Недостаточно средств, внесите еще " + (CoffeeEnum.Exp.getPrice() - cashExp) + ": ");
                int newCash = on.nextInt();
                cashExp += newCash;
            }
        }
    }
    private void getCashMok(Scanner on, int cashMok) {
        while (true) {
            if (cashMok >= CoffeeEnum.Mok.getPrice()) {
                System.out.println("Возьмите свой " + CoffeeEnum.Mok.getType() + ", цена " + CoffeeEnum.Mok.getPrice());
                System.out.println("Ваша сдача " + Math.abs(cashMok - CoffeeEnum.Mok.getPrice()));
                break;
            } else {
                System.out.print("Недостаточно средств, внесите еще " + (CoffeeEnum.Mok.getPrice() - cashMok) + ": ");
                int newCash = on.nextInt();
                cashMok += newCash;
            }
        }
    }
}
