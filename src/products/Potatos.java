package products;

public class Potatos extends SomeProduct {
    private static int count = 180;
    private int price = 90;
    private String productName = "Картошка";
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
}
