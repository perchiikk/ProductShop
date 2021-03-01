package products;

public class Onion extends SomeProduct{
    private static int count = 100;
    private int price = 10;
    private String productName = "Лук";
    private boolean alco = false;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isAlco() {
        return alco;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }
}
