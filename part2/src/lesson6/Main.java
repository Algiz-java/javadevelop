package lesson6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        float itogo = 0;
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        System.out.println("Отчет за "+ timeStamp + ":");
        for (int i = 0; i < 5; i++) { //вывод 5 товаров
            Buy buy = new Buy();
            Tovar tovar = new Tovar();
            Random random = new Random();
            Product product = new Product(tovar.ObjectName,random.nextInt(500),random.nextInt(10));
            buy.z = product.quant;
            buy.check();
            product.z = buy.sums;
            product.PrintPrice();
            product.diff();
            itogo += buy.sums;
        }
        System.out.printf("Общая прибыль: %s руб.", itogo);
    }
}