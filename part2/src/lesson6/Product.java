package lesson6;



class Product {
    float z;
    String name;
    int val; //наличие на складе, продано в шт.
    int quant; //продано за день

    void PrintPrice() {
        System.out.print(name +": " + "\t" + "на складе " + val + "\t" + " продано " + quant + "\t"
                + " прибыль за день " + z + " руб. " + "\t");
    }

    void diff() {
        int residue = val - quant; //сколько осталось в конце дня
        System.out.println("остаток: " + residue + " шт.");
    }
}