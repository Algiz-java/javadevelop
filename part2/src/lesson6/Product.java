package lesson6;



class Product {
    float z;
    String name;
    int val;    //наличие на складе, продано в шт.
    int quant; //продано за день

    void PrintPrice() {
        System.out.format("%-9s", name);
        System.out.printf("%-14s", "|на складе " + val);
        System.out.printf("%-10s", " |продано " + quant );
        System.out.printf("%-30s", " |прибыль за день " + z + " руб. ");
    }

    void diff() {
        int residue = val - quant; //сколько осталось в конце дня
        System.out.printf("%-13s%n", "|остаток: " + residue + " шт.");
    }
}