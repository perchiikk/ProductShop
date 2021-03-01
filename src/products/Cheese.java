package products;

public class Cheese extends SomeProduct {
    private static int count = 123;
    private int price = 120;
    private boolean alco = false;
    private String name = "Сыр";

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
        Cheese.count = count;
    }

    public String getProductName() {
        return name;
    }
}
