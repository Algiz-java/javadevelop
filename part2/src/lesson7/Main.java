package lesson7;



public class Main {
    public static void main(String[] args) {
        for (CoffeeEnum coffee : CoffeeEnum.values()) {
            System.out.println(coffee.getNum() + ". " + coffee.getType() + ": " + coffee.getPrice());
        }
        int v = 200; //volume bottel for water in mL
        int cup = v / 100;//cups of coffee
        CalcEnum metodEnum = new CalcEnum();
        while (cup >= metodEnum.getCount()) {
            metodEnum.check();
        }
        System.out.println("Итого: " + metodEnum.getSumma());
        System.out.println("Требуется обслуживание");
    }
}
