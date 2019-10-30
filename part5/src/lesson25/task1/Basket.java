package lesson25.task1;

import java.util.HashMap;

interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    HashMap<String, Integer> getProducts();

    int getProductQuantity(String product);
}
