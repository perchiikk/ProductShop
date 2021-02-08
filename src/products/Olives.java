package products;

public class Olives extends SomeProduct{
    private int count = 80;
    private int price = 80;
    private String productName = "Оливки";

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
