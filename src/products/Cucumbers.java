package products;

public class Cucumbers extends SomeProduct {
    private static int count = 320;
    private int price = 140;
    private boolean alco = false;
    private static String name = "Огурец";

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
        Cucumbers.count = count;
    }

    public static String getProductName() {
        return name;
    }
}
