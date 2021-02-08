import products.Beer;
import products.Juice;
import products.SomeProduct;
import products.Vodka;

public class Test {

    public static void main(String[] args) {
        Customer tanya = new Customer(1000);
        tanya.addToCart(new Vodka(), 4);
        tanya.showProductCar();
        tanya.buy();
    }
}
