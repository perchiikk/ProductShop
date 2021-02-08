package products;

public class Beer extends SomeProduct {
    private int count = 100;
    private int price = 50;
    private String nameProduct = "Пиво";

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
