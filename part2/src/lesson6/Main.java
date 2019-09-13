package lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Product product = new Product();
        Buy price = new Buy();
        System.out.print("Введите название продукта: ");
        product.name = in.next();
        System.out.print("Введите количество: ");
        product.quant = in.nextInt();
        System.out.print("Введите цену: ");
        price.x = in.nextInt();
        price.z = product.quant;
        price.check();
        product.PrintPrice();
        System.out.println(price.sums + " руб.");
    }
}
