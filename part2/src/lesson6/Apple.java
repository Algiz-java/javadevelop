package lesson6;

class Apple extends Product {
    String sort;
    Apple(String name, String sort, float price, float value) {
        super(name, price, value);
        this.sort = sort;
    }

}
