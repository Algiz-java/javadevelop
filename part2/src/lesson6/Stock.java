package lesson6;

class Stock {
    private Product[] products;

    Stock() {
        products = new Product[5];
        TradePrice tradePrice = new TradePrice();
        final float PERCENT = 1.2f;
        products[0] = new Product("Apple", tradePrice.getApplePrice() * PERCENT,4.5f);
        products[1] = new Product("Orange", tradePrice.getOrangePrice() * PERCENT,6.5f);
        products[2] = new Product("Tomato",tradePrice.getTomatoPrice() * PERCENT,10.4f);
        products[3] = new Product("Beer",tradePrice.getBeerPrice() * PERCENT,40f);
        products[4] = new Product("Milk",tradePrice.getMilkPrice() * PERCENT,20f);
    }
    float sumOfCost() {
        float sum = 0;
        for (Product c : products){
            sum += c.getSum();
        }
        return sum;
    }
    void printTable() {
        for (int i = 0; i < 5; i++) {
            System.out.format("%-6s", products[i].name);
            System.out.printf("%-13s", " |price " + String.format("%.2f",products[i].price));
            System.out.printf("%-12s", " |sale " + String.format("%.2f",products[i].value));
            System.out.printf("%-12s%n", " |total " + String.format("%.2f",products[i].getSum()));
        }
    }
}
