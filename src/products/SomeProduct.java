package products;

import java.util.Objects;

public abstract class SomeProduct {
    private int count;
    private int price;
    private String productName;

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeProduct that = (SomeProduct) o;
        return count == that.count &&
                price == that.price &&
                Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, price, productName);
    }
}
