import products.Beer;
import products.Customer;
import products.Juice;
import products.Vodka;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Customer tanya = new Customer(1000);
        tanya.addtoCart(new Vodka(), 4);
        tanya.addtoCart(new Beer(), 1);
        tanya.addtoCart(new Juice(), 2);
        tanya.buy();

    }
}
