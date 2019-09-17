package lesson7;


public class Main {
    public static void main(String[] args) {
        for (CoffeeEnum coffee : CoffeeEnum.values()) {
            System.out.println(coffee.getNum() + ". " + coffee.getType() + ": " + coffee.getPrice());
        }
        CalcEnum metodEnum = new CalcEnum();
        metodEnum.check();
    }
}
