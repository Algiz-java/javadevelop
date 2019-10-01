package lesson6;

class Sklad {
    private Product[] products;

    Sklad() {
        products = new Product[5];
        products[0] = new Product("Apple",38.31f,4.5f);
        products[1] = new Product("Orange",80.45f,6.5f);
        products[2] = new Product("Tomato",60.82f,10.4f);
        products[3] = new Product("Beer",41.34f,40f);
        products[4] = new Product("Milk",62.38f,20f);
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
