package lesson14;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Вывод товаров на консоль");
        for (CoffeeEnum coffee : CoffeeEnum.values()) {
            System.out.println(coffee.getNum() + ". " + coffee.getType() + ": " + coffee.getPrice());
        }
        int v = 500; //volume bottel for water in mL
        int cup = v / 100;//cups of coffee
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        CalcEnum metodEnum = new CalcEnum();
        while (cup >= metodEnum.getCount()) {
            logger.trace("{} цикл программы", metodEnum.getCount());
            metodEnum.check();
        }
        logger.info("Конец программы");
        Date end = new Date();
        String endDate = sdfDate.format(end);
        System.out.println("Заработано с " + strDate + " по " + endDate + ": " + metodEnum.getSumma() + " руб.");
        System.out.println("Требуется обслуживание");
    }
}
