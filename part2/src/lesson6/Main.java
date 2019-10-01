package lesson6;


public class Main {

    public static void main(String[] args) {
        Sklad cost;
        cost = new Sklad();
        cost.printTable();
        System.out.println("Total sum " + String.format("%.2f",cost.sumOfCost()) + " rub.");
    }
}