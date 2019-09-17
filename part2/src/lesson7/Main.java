package lesson7;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
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
            metodEnum.check();
        }
        Date end = new Date();
        String endDate = sdfDate.format(end);
        System.out.println("Заработано с " + strDate + " по " + endDate + ": " + metodEnum.getSumma() + " руб.");
        System.out.println("Требуется обслуживание");
    }
}
