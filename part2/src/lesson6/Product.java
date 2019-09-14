package lesson6;



class Product {
    float z;
    String name;
    int val;    //наличие на складе, продано в шт.
    int quant; //продано за день

    void PrintPrice() {
        //System.out.format("%5s",name + ": " + "\t" + "на складе " + val + "\t" + " продано " + quant + "\t" + " прибыль за день " + z + " руб. " + "\t");
        System.out.format("%-10s", name + ": "); //+ "\t" + "на складе " + val + "\t" + " продано " + quant + "\t" + " прибыль за день " + z + " руб. " + "\t");
        System.out.format("%-10s", "на складе " + val);
        System.out.format("%-10s", " продано " + quant );
        System.out.format("%-10s", " прибыль за день " + z + " руб. ");
    }

    void diff() {
        int residue = val - quant; //сколько осталось в конце дня
        System.out.format("%-10s%n", "остаток: " + residue + " шт.");
    }
}