import products.SomeProduct;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Customer(int budget) {
        this.budget = budget;
    }

    private Map<SomeProduct, Integer> productCart = new HashMap<>();

    /***
     * Добавить позицию в корзину, если кол-во на складе позволяет
     * @param someProduct
     * @param count
     */
    public void addToCart(SomeProduct someProduct, int count) {
        if(count <= someProduct.getCount()){
            if (productCart.containsKey(someProduct)) {
                int lastKey = productCart.get(someProduct);
                lastKey += count;
                productCart.put(someProduct, lastKey);
            } else {
                productCart.put(someProduct, count);
            }
            someProduct.setCount(someProduct.getCount() - count);
        }
        else {
            System.out.println("Такого количества " + someProduct.getClass().getSimpleName() + " нет на складе");
        }

    }

    /***
     * Удалить позицию из корзины
     * @param someProduct
     */
    public void removeCart(SomeProduct someProduct) {
        if(productCart.containsKey(someProduct)){
            productCart.remove(someProduct);
            System.out.println("убрали из корзины");
        }
    }

    /**
     * Получить стоимость всех продуктов из корзины
     * @return сумма покупки
     */
    public int getSum() {
        int sumAll = 0;
        for (Map.Entry<SomeProduct, Integer> set : productCart.entrySet()) {
            SomeProduct currentProduct = set.getKey();
            int currentCount = set.getValue();
            System.out.println(currentProduct.getPrice());
            int sum = currentProduct.getPrice() * currentCount;
            sumAll += sum;
        }
        return sumAll;
    }

    /***
     * Совершить покупку
     */
    public void buy() {
        int sumAll = getSum();
        int result = budget - sumAll;
        if (result >= 0) {
            System.out.println("Покупка на сумму " + sumAll + " рублей успешно совершена. Остаток на счёте " + result + " рублей");
        } else {
            System.out.println("Недостаточно денег для покупки.");
        }
    }

    /***
     * Показать содержимое корзины
     */
    public void showProductCar(){
        System.out.println("Ваша корзина содержит: ");
        for(Map.Entry<SomeProduct, Integer> map : productCart.entrySet()){
            System.out.println(map.getKey().getClass().getSimpleName() + " в количестве " + map.getValue());
        }
    }
}
