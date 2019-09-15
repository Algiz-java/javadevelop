package lesson6;


public class Main {

    public static void main(String[] args) {
        Cost cost;
        cost = new Cost();
        cost.printTable();
        System.out.println("Total sum " + String.format("%.2f",cost.sumOfCost()));
    }
}