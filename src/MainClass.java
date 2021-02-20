import instance.*;
import products.*;


public class MainClass {

    public static void main(String[] args) {
        Customer tanya = new Customer(1000000, new ProductCart(), 18);
        System.out.println(new Vodka().getCount());
        tanya.addToCart(new Vodka(), 1);
        System.out.println(new Vodka().getCount());
        tanya.addToCart(new Vodka(), 94);
        System.out.println(new Vodka().getCount());
    }
}

