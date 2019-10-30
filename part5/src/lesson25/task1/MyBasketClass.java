package lesson25.task1;

import java.util.HashMap;

public class MyBasketClass implements Basket {
    private HashMap<String, Integer> product = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        this.product.put(product, quantity);

    }

    @Override
    public void removeProduct(String product) {
        this.product.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int value = this.product.get(product);
        this.product.put(product, value+quantity);
    }

    @Override
    public void clear() {
        product.clear();
    }

    @Override
    public HashMap<String, Integer> getProducts() {
        return this.product;
    }


    @Override
    public int getProductQuantity(String product) {
        return this.product.get(product);
    }
}
