package lesson6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        System.out.println("Отчет за "+ timeStamp + ":");
        for (int i = 0; i < 5; i++) {
            Product product = new Product();
            Buy price = new Buy();
            Tovar object = new Tovar();
            Random random = new Random();
            product.name = object.ObjectName;
            product.val = random.nextInt(500);
            product.quant = random.nextInt(10);
            price.z = product.quant;
            price.check();
            product.z = price.sums;
            product.PrintPrice();
            product.diff();
        }
    }
}