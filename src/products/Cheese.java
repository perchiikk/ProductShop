package products;

public class Cheese extends SomeProduct {
    private int count = 123;
    private int price = 120;
    private String productName = "Сыр";

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
