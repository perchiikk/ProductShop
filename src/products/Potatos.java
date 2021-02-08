package products;

public class Potatos extends SomeProduct{
    private int count = 180;
    private int price = 90;
    private String productName = "Картошка";
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
