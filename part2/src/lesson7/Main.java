package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер программы 1 (enum) или 2 (массив): ");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println(CoffeeEnum.Cup.getNum() + ". " + CoffeeEnum.Cup.getType() + ": " + CoffeeEnum.Cup.getPrice());
            System.out.println(CoffeeEnum.Lat.getNum() + ". " + CoffeeEnum.Lat.getType() + ":    " + CoffeeEnum.Lat.getPrice());
            System.out.println(CoffeeEnum.Exp.getNum() + ". " + CoffeeEnum.Exp.getType() + ": " + CoffeeEnum.Exp.getPrice());
            System.out.println(CoffeeEnum.Mok.getNum() + ". " + CoffeeEnum.Mok.getType() + ": " + CoffeeEnum.Mok.getPrice());
            CalcEnum metodEnum = new CalcEnum();
            metodEnum.different();
        } else {
            Coffee coffee = new Coffee();
            coffee.getSortCoffee();
            System.out.print("Выберите напиток в формате A0: ");
            coffee.select = in.next();
            coffee.check();
        }
    }
}
