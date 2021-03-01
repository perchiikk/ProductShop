package products;

import java.util.Objects;

public abstract class SomeProduct {
    private static int count;
    private int price;
    private boolean alco;
    private String productName;

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAlco() {
        return alco;
    }

    public void setCount(int count) {
        SomeProduct.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeProduct that = (SomeProduct) o;
        return price == that.price && alco == that.alco && Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, alco, productName);
    }
}
