package products;

public class Vine extends SomeProduct{
    private int count = 90;
    private int price = 350;
    private String productName = "Вино";

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
