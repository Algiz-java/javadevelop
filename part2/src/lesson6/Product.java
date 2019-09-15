package lesson6;


class Product {
    private float price;
    private float value;

    Product(String name, float price, float value) {
        this.price = price;
        this.value = value;
    }

    float getSum() {
        float sum;
        return sum = price * value;
    }
}
