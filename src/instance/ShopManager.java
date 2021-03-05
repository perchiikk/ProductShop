package instance;

import instance.Customer;
import instance.ProductCart;
import products.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShopManager {
    private Map<String, Integer> mapOfOrder;
    private String nameCustomer;
    private int ageCustomer;
    private int budgetCustomer;

    public int getAgeCustomer() {
        return ageCustomer;
    }

    public int getBudgetCustomer() {
        return budgetCustomer;
    }

    /**
     * Приветсвие с покупателем
     * @throws IOException
     */
    public void sayHello() {
        ConsoleHelper.writeMessage("Добро пожаловать в наш магазин! Как вас зовут?");
        nameCustomer = ConsoleHelper.readText();
        ConsoleHelper.writeMessage("Сколько вам лет?");
        while (true){
            ageCustomer = ConsoleHelper.readInt();
            if(ageCustomer > 0){
                break;
            }
            else {
                System.out.println("Неверный возраст. Повторите ввод");
            }
        }
        ConsoleHelper.writeMessage("Введите ваш бюджет");
        while (true){
            budgetCustomer = ConsoleHelper.readInt();
            if(budgetCustomer > 0){
                break;
            }
            else{
                System.out.println("Неверный бюджет. Повторите ввод");
            }
        }
        ConsoleHelper.writeMessage("Отлично! Ваш профиль создан. Выберите позиции для покупки");
        for(Map.Entry<String, SomeProduct> entry : Storage.storageMap.entrySet()){
            System.out.print(entry.getKey() + ", ");
        }
        System.out.println();
        System.out.println("====================");
    }

    /**
     * Передача списка заказа
     * @throws IOException
     */
    public Map<String, Integer> getOrder() {
        mapOfOrder = new HashMap<>();
        String order = "";
        int count = 0;
        while(true){
            order = getProductName();
            if(order.equals("exit")){
                break;
            }
            count = getCountOfProduct();
            mapOfOrder.put(order, count);
        }
        return mapOfOrder;
    }

    public SomeProduct getTypeProduct(String nameProduct){
        return Storage.storageMap.get(nameProduct);
    }

    public String getProductName() {
        String order;
        while (true){
            ConsoleHelper.writeMessage("Введите название позиции или exit для выхода");
            order = ConsoleHelper.readText().toLowerCase();
            if(order.equals("exit")){
                break;
            }
            else if(Storage.storageMap.containsKey(order)){
                return order;
            }
            else{
                ConsoleHelper.writeMessage("Вы ввели неверное название товара");
            }
        }
        return order = "exit";
    }

    public int getCountOfProduct() {
        int count = 0;
        while (true){
            ConsoleHelper.writeMessage("Введите количество");
            count = ConsoleHelper.readInt();
            if(count > 0) {
                return count;
            }
            else {
                ConsoleHelper.writeMessage("Введите число больше 0");
            }
        }
    }
}

