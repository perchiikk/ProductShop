package instance;

import products.SomeProduct;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Customer {
    private double budget;
    private ProductCart productCart;
    private int age;
    private boolean answerForAge = false;
    private ShopManager shopManager;

    public Customer(double budget, ProductCart productCart, int age, ShopManager shopManager) {
        this.budget = budget;
        this.productCart = productCart;
        this.age = age;
        this.shopManager = shopManager;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public ProductCart getProductCart() {
        return productCart;
    }

    public void setProductCart(ProductCart productCart) {
        this.productCart = productCart;
    }

    public int getAge() {
        return age;
    }

    public void addToCartOrder() throws IOException {
        Map<String, Integer> mapOfOrder = shopManager.getOrder();
        for(Map.Entry<String, Integer> entry : mapOfOrder.entrySet()){
            SomeProduct someProduct = shopManager.getTypeProduct(entry.getKey());
            int count = entry.getValue();
            productCart.addToCart(someProduct, count);
            System.out.println("====================");
        }
    }
    /**
     * Пользователь добавляет позицию в корзину
     *
     * @param someProduct
     * @param count
     */
    public void addToCart(SomeProduct someProduct, int count) {
        productCart.addToCart(someProduct, count);
        System.out.println("====================");
    }

    /**
     * Показать содержимое коризны пользователя
     */
    public void showProductCar() {
        productCart.showProductCar();
        System.out.println("====================");
    }

    /**
     * Удалить элемент из корзины
     *
     * @param someProduct
     * @param count
     */
    public void removeFromProductCar(SomeProduct someProduct, int count) {
        productCart.removeFromCart(someProduct, count);
        System.out.println("====================");
    }

    /**
     * Удалить все содержимое корзины
     */
    public void removeAllCart() {
        productCart.removeAll();
        System.out.println("====================");
    }

    /**
     * Получить стоимость всего в корзине
     */
    public void getSumm() {
        productCart.getSum();
        System.out.println("====================");
    }

    /**
     * Совершить покупку
     */
    public void buy() {

        List<SomeProduct> alcoProduct = productCart.getAlco();
        if (!alcoProduct.isEmpty()) {
            if (getAge() >= 18) {
                System.out.println("Продажа алкоголя разрешена, Вам есть 18, поздравляю");
            } else {
                System.out.println("Вам нет 18, продажа алкоголя запрещена. Удалим алкоголь из вашей корзины");
                for (int i = 0; i < alcoProduct.size(); i++) {
                    productCart.removeCount(alcoProduct.get(i));
                }
            }
        }
        double allSum = productCart.getSum();
        if (allSum <= budget) {
            System.out.println("Покупка на сумму " + allSum + " р. выполнена успешно");
            setBudget(budget - allSum);
            System.out.println("Остаток средств " + getBudget() + " р.");
            productCart.removeAll();
        } else {
            System.out.println("Недостаточно средств");
        }

        System.out.println("====================");
    }
}
