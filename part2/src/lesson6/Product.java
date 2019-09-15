package lesson6;


class Product {
    float price;
    float value;
    String name;

    Product(String name, float price, float value) {
        this.price = price;
        this.value = value;
        this.name = name;
    }

    float getSum() {
        return price * value;
    }

}
