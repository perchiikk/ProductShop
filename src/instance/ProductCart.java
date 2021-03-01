package instance;

import products.SomeProduct;

import java.util.*;

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
            System.out.println("Товар успешно доабвлен в корзину");
            someProduct.setCount(someProduct.getCount() - count);
        }
        else {
            System.out.println("Такого количества " + someProduct.getClass().getSimpleName() + " нет на складе");
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
     * Удалить из корзины определенную позицию
     * @param someProduct
     * @param count
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
    }

    /**
     * Очистить корзину полностью
     */
    public void removeAll(){
        /*for(Iterator<Map.Entry<SomeProduct, Integer>> it = productCart.entrySet().iterator(); it.hasNext();){
            Map.Entry<SomeProduct, Integer> entry = it.next();
            for(int i = 0; i<productCart.size(); i++){
                it.remove();
            }
        }*/
        productCart.clear();
        System.out.println("Корзина пуста");
    }

    /**
     * Получить стоимость всех продуктов из корзины с учетом скидки
     */
    public double getSum() {
        double sumAll = 0;
        List<SomeProduct> discountList = getDiscount();
        for (Map.Entry<SomeProduct, Integer> set : productCart.entrySet()) {
            SomeProduct currentProduct = set.getKey();
            int currentCount = set.getValue();
            double sum = currentProduct.getPrice() * currentCount;
            if(!discountList.isEmpty() && discountList.contains(currentProduct)){
                sum = sum * 0.9;
            }
            sumAll += sum;
        }
        System.out.println("Сумма покупок на данный момент: " + sumAll);
        return sumAll;
    }

    /**
     * Акция если в корзине более 4-х штук одной позиции(неважно какой) идет скидка 10%
     */
    public List<SomeProduct> getDiscount(){
        List<SomeProduct> discountList = new ArrayList<>();
        for (Map.Entry<SomeProduct, Integer> entry : productCart.entrySet()) {
            int x = entry.getValue();
            if (x > 4){
                discountList.add(entry.getKey());
            }
        }
        return discountList;
    }

    public List<SomeProduct> getAlco(){
        List<SomeProduct> alcoProduct = new ArrayList<>();
        for(Map.Entry<SomeProduct, Integer> entry : productCart.entrySet()){
            if(entry.getKey().isAlco()){
                alcoProduct.add(entry.getKey());
            }
        }
        return alcoProduct;
    }

    public void removeCount(SomeProduct someProduct){
        if(productCart.containsKey(someProduct)){
            productCart.remove(someProduct);
            System.out.println("Алкоголь " + someProduct.getClass().getSimpleName() + " успешно удален из корзины");
        }
    }

    public Map<SomeProduct, Integer> getProductCart() {
        return productCart;
    }
}
