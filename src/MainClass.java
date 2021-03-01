import instance.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MainClass {

    public static void main(String[] args) throws IOException {
        /*Customer tanya = new Customer(1000000, new ProductCart(), 18);
        System.out.println(new Vodka().getCount());
        tanya.addToCart(new Vodka(), 1);
        System.out.println(new Vodka().getCount());
        tanya.addToCart(new Vodka(), 94);
        System.out.println(new Vodka().getCount());
        tanya.addToCart(new Juice(), 4);
        System.out.println(new Juice().getCount());
        tanya.addToCart(new Cucumbers(), 4);
        System.out.println(new Cucumbers().getCount());
        tanya.addToCart(new Cucumbers(), 1);
        System.out.println(new Cucumbers().getCount());
        tanya.buy();
        System.out.println(new Cucumbers().getCount());*/

        ShopManager shopManager = new ShopManager();
        Customer tanya = new Customer(shopManager.getBudgetCustomer(), new ProductCart(), shopManager.getAgeCustomer(), shopManager);
        shopManager.sayHello();
        tanya.addToCartOrder();
        tanya.buy();
    }

}

// взаимодействие через консоль
//jdbc

