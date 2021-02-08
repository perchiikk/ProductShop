package products;

public class Cucumbers extends SomeProduct {
    private int count = 320;
    private int price = 140;
    private String productName = "Огурец";

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
