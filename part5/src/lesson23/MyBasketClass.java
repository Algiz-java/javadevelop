package lesson23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyBasketClass implements Basket {
    private List<String> product = new ArrayList<>();
    private List<Integer> quantity = new LinkedList<>();

    @Override
    public void addProduct(String product, int quantity) {
        this.product.add(product);
        this.quantity.add(quantity);
    }

    @Override
    public void removeProduct(String product) {
        this.quantity.remove(this.product.indexOf(product));
        this.product.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (String string : this.product) {
            if (string.contains(product)) {
                int i = this.quantity.get(this.product.indexOf(product));
                this.quantity.add(this.quantity.indexOf(i),i + quantity);
            }
        }
    }

    @Override
    public void clear() {
        product.clear();
    }

    @Override
    public List<String> getProducts() {
        return product;
    }

    @Override
    public List<Integer> getQuantity() {
        return quantity;
    }

    @Override
    public int getProductQuantity(String product) {
        int quantity = 0;
        for (String string : this.product) {
            if (string.contains(product)) {
                quantity = this.quantity.get(this.product.indexOf(product));
            }
        }
        return quantity;
    }
}
