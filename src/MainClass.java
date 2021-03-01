import instance.*;
import products.Beer;

import java.io.IOException;


public class MainClass {

    public static void main(String[] args) throws IOException {
        ShopManager shopManager = new ShopManager();
        shopManager.sayHello();
        Customer tanya = new Customer(shopManager.getBudgetCustomer(), new ProductCart(), shopManager.getAgeCustomer(), shopManager);
        tanya.addToCartOrder();
        System.out.println();
        tanya.removeFromProductCar(new Beer(), 2);
        System.out.println();
        tanya.buy();
    }

}
