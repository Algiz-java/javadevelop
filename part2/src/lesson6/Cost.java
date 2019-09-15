package lesson6;

import java.util.Arrays;

class Cost {
    private Product[] products;

    Cost() {
        products = new Product[5];
        products[0] = new Apple("apple","red",38.3f,4.5f);
        products[1] = new Product("orange",80.45f,6.5f);
        products[2] = new Product("tomato",60.8f,10.4f);
        products[3] = new Product("beer",41.3f,40f);
        products[4] = new Product("milk",62.3f,20f);
    }
    float sumOfCost() {
        float sum = 0;
        for (Product c : products){
            sum += c.getSum();
        }
        return sum;
    }
    void printTable() {
        for (Product str : products)
        System.out.println(Arrays.asList(str));
        //System.out.printf("%-14s", "|на складе " + val);
        //System.out.printf("%-10s", " |продано " + quant );
        //System.out.printf("%-30s", " |прибыль за день " + z + " руб. ");
    }
}
