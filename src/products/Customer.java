package products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static products.SomeProduct.*;

public class Customer {
    int budget;

    ArrayList<Object> shoppingCart;
    public static Map<SomeProduct, Integer> productCart = new HashMap<>();

    public Customer(int budget){
        this.budget = budget;
    }

    public static void addtoCart(SomeProduct someProduct, int count){
        if(productCart.containsKey(someProduct)){
            int lastKey = productCart.get(someProduct);
            lastKey += count;
            productCart.put(someProduct, lastKey);
        }
        else {
            productCart.put(someProduct, count);
        }
    }

    public void removeCart(SomeProduct someProduct){
        productCart.remove(someProduct);
    }


    public int getSum(){
        int sumAll = 0;
        for(Map.Entry<SomeProduct, Integer> set : productCart.entrySet()){
            SomeProduct currentProduct = set.getKey();
            int currentCount = set.getValue();
            System.out.println(currentProduct.getPrice());
            int sum = currentProduct.getPrice() * currentCount;
            sumAll += sum;
        }
        return sumAll;
    }

    public void buy(){
        int sumAll = getSum();
        int result = budget - sumAll;
        if(result>=0){
            System.out.println("Покупка на сумму " + sumAll + " рублей успешно совершена. Остаток на счёте " + result + " рублей");
        }
        else {
            System.out.println("Недостаточно денег для покупки.");
        }
    }
}

