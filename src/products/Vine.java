package products;

public class Vine extends SomeProduct{
    private static int count = 90;
    private int price = 350;
    private static String productName = "Вино";
    private boolean alco = true;

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
