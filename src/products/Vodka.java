package products;

public class Vodka extends SomeProduct{
    private int count = 100;
    private int price = 50;
    private String productName = "Водка";

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
