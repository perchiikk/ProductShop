package products;

public class Tomatos extends SomeProduct{
    private static int count = 130;
    private int price = 80;
    private static String productName = "Томат";
    private  boolean alco = false;

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

    public static String getProductName() {
        return productName;
    }
}
