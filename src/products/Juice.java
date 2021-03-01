package products;

public class Juice extends SomeProduct {
    private static  int count = 70;
    private  int price = 100;
    private boolean alco = false;
    private static String name = "Сок";

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
        return name;
    }
}
