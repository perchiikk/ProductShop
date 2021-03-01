package products;

public class Vodka extends SomeProduct{
    private static int count = 100;
    private int price = 50;
    private static String productName = "Водка";
    private boolean alco = true;

    @Override
    public int getCount() {
        return Vodka.count;
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
        Vodka.count = count;
    }

    public static String getProductName() {
        return productName;
    }
}
