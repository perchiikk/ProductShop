package products;

public class Beer extends SomeProduct {
    private static int count = 100;
    private int price = 50;
    private boolean alco = true;
    private String name = "Пиво";

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAlco() {
        return alco;
    }

    public String getName() {
        return name;
    }
}
