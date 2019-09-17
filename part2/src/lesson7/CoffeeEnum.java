package lesson7;

public enum CoffeeEnum {
    CUP(1,"капучино", 50), LAT(2,"латте", 58),
    ESP(3,"эспрессо", 45), MOK(4,"мокачино", 56),
    RAF(5,"кофе раф", 80), TEA(6,"чай", 30);

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
