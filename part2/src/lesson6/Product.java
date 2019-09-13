package lesson6;

class Product {
    String name;
    int quant; //количество в шт.

    void PrintPrice() {
        System.out.print(name + ", количество: " + quant + " к оплате ");
    }
}
