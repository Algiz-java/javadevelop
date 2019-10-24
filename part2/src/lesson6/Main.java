package lesson6;


public class Main {

    public static void main(String[] args) {
        Stock cost;
        cost = new Stock();
        cost.printTable();
        System.out.println("Total sum = " + String.format("%.2f",cost.sumOfCost()) + " rub.");
        SellerName sellerName = new SellerName();
        System.out.println("Seller Name: " + sellerName.getLastName(2) + " "
                + sellerName.getName(0));
    }
}