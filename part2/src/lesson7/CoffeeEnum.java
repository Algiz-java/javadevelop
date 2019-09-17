package lesson7;

public enum CoffeeEnum {
         Cup(1,"капучино", 50), Lat(2,"латте", 58),
         Mok(4,"мокачино", 56) ,Exp(3,"эспрессо", 45);

    private int num;
    private String type;
    private int price;

    CoffeeEnum(int num, String type, int price) {
        this.num = num;
        this.type = type;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
