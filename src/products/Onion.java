package products;

public class Onion extends SomeProduct{
    private int count = 100;
    private int price = 10;
    private String productName = "Чеснок";

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
