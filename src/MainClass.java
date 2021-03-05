import instance.*;

import java.io.IOException;


public class MainClass {

    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();
        shopManager.sayHello();
        Customer tanya = new Customer(shopManager.getBudgetCustomer(), new ProductCart(), shopManager.getAgeCustomer(), shopManager);
        tanya.addToCartOrder();
        tanya.buy();
    }

}
