package products;

import java.util.Objects;

public abstract class SomeProduct {
    private int count;
    private int price;
    private boolean alco;

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
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeProduct that = (SomeProduct) o;
        return count == that.count && price == that.price && alco == that.alco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, price, alco);
    }
}
