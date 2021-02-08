package products;

public class Tomatos extends SomeProduct{
    private int count = 130;
    private int price = 80;
    private String productName = "Томат";

    public int getPrice() {
        return price;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }
}
