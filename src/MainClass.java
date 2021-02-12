import products.Beer;
import products.Juice;
import products.SomeProduct;
import products.Vodka;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {
        Customer tanya = new Customer(1000, new ProductCart());
        tanya.getProductCart().addToCart(new Juice(), 4);
        tanya.getProductCart().showProductCar();
        tanya.buy();
        tanya.getProductCart().showProductCar();
        tanya.getProductCart().addToCart(new Juice(), 4);
        tanya.getProductCart().addToCart(new Vodka(), 4);
        tanya.getProductCart().showProductCar();
        tanya.getProductCart().removeFromCart(new Vodka(), 3);
        tanya.getProductCart().showProductCar();
        System.out.println(tanya.getProductCart().getSum());
        System.out.println(tanya.getBudget());
        tanya.getProductCart().addToCart(new Juice(), 4);
        tanya.buy();
    }
}

// скидка на товары от х штук
//добавить возраст
// не продавать бухло если возраст меньше 18
//сущности в отдельный пакет
// sql  создавать таблицы, insert, delete, update
