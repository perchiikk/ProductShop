import products.SomeProduct;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductCart {
    private Map<SomeProduct, Integer> productCart = new HashMap<>();

    /**
     * Добавить позицию в корзину, если кол-во на складе позволяет
     * @param someProduct
     * @param count
     */
    public void addToCart(SomeProduct someProduct, int count){
        if(count <= someProduct.getCount()){
            if(productCart.containsKey(someProduct)){
                int lastKey = productCart.get(someProduct);
                lastKey += count;
                productCart.put(someProduct, lastKey);
            }
            else {
                productCart.put(someProduct, count);
            }
        }
        else {
            System.out.println("Такого количества" + someProduct.getClass().getSimpleName() + " нет на складе");
        }
    }

    /**
     * Показать содержимое корзины
     */
    public void showProductCar(){
        System.out.println("Ваша корзина содержит: ");
        for(Map.Entry<SomeProduct, Integer> map : productCart.entrySet()){
            System.out.println(map.getKey().getClass().getSimpleName() + " в количестве " + map.getValue());
        }
    }

    /**
     * Удалить позицию из корзины
     * @param someProduct
     */
    public void removeFromCart(SomeProduct someProduct, int count) {
        if(productCart.containsKey(someProduct)){
            int currentCount = productCart.get(someProduct);
            if(currentCount > count){
                productCart.put(someProduct, currentCount-count);
                System.out.println("Количество успешно изменено");
            }
            else if(currentCount == count){
                productCart.remove(someProduct);
                System.out.println("Товар успешно удален из корзины");
            }
            else {
                System.out.println("Такого количества нет в корзине");
            }
        }
        else {
            System.out.println("Такого товара нет в корзине");
        }
        System.out.println("==================");
    }

    /**
     * Очистить корзину полностью
     */
    public void removeAll(){
        for(Iterator<Map.Entry<SomeProduct, Integer>> it = productCart.entrySet().iterator(); it.hasNext();){
            Map.Entry<SomeProduct, Integer> entry = it.next();
            for(int i = 0; i<productCart.size(); i++){
                it.remove();
            }
        }
        System.out.println("Корзина пуста");
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
            int sum = currentProduct.getPrice() * currentCount;
            sumAll += sum;
        }
        return sumAll;
    }

}
