import instance.*;

import java.io.IOException;


public class MainClass {

    public static void main(String[] args) throws IOException {
        ShopManager shopManager = new ShopManager();
        Customer tanya = new Customer(shopManager.getBudgetCustomer(), new ProductCart(), shopManager.getAgeCustomer(), shopManager);
        shopManager.sayHello();
        tanya.addToCartOrder();
        tanya.buy();
    }

}

// взаимодействие через консоль
//jdbc

