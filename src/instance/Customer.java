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

    /**
     * Передача выбранных позиций в метод addToCart
     * @throws IOException
     */
    public void addToCartOrder() {
        Map<String, Integer> mapOfOrder = shopManager.getOrder();
        if(mapOfOrder.isEmpty()){
            ConsoleHelper.writeMessage("Невозможно положить товар в корзину. Вы не выбрали ни одной позиции");
        }
        else {
            for(Map.Entry<String, Integer> entry : mapOfOrder.entrySet()){
                SomeProduct someProduct = shopManager.getTypeProduct(entry.getKey());
                int count = entry.getValue();
                productCart.addToCart(someProduct, count);
            }
            ConsoleHelper.writeMessage("\n");
            ConsoleHelper.writeMessage("Товар успешно добавлен в корзину");
            System.out.println("====================");
        }
    }
    /**
     * Пользователь добавляет позицию в корзину
     */
    public void addToCart(SomeProduct someProduct, int count) {
        productCart.addToCart(someProduct, count);
        System.out.println("====================");
    }

    /**
     * Показать содержимое коризны пользователя
     */
    public void showProductCar() {
        if(productCart.getEmpty()){
            ConsoleHelper.writeMessage("Ваша корзина пуста");
        }
        else {
            productCart.showProductCar();
            System.out.println("====================");
        }
    }

    /**
     * Удалить элемент из корзины
     */
    public void removeFromProductCar(SomeProduct someProduct, int count) {
        if(productCart.getEmpty()){
            ConsoleHelper.writeMessage("Ваша корзина пуста");
        }
        else {
            productCart.removeFromCart(someProduct, count);
            System.out.println("====================");
        }
    }

    /**
     * Удалить все содержимое корзины
     */
    public void removeAllCart() {
        if(productCart.getEmpty()){
            ConsoleHelper.writeMessage("Нельзя очистить корзину. Ваша корзина уже пуста");
        }
        else {
            productCart.removeAll();
            System.out.println("====================");
        }
    }

    /**
     * Получить стоимость всего в корзине
     */
    public void getSumm() {
        if(productCart.getEmpty()){
            ConsoleHelper.writeMessage("Нельзя получить сумму покупки. Ваша корзина пуста");
        }
        else {
            productCart.getSum();
            System.out.println("====================");
        }
    }

    /**
     * Совершить покупку
     */
    public void buy() {
        if(productCart.getEmpty()){
            ConsoleHelper.writeMessage("Невозможно совершить покупку. Ваша корзина пуста");
        }
        else {
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
}
