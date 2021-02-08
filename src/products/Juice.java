package products;

public class Juice extends SomeProduct {
    private int count = 70;
    private int price = 100;
    private String productName = "Сок";

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
