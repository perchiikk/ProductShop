package instance;

import instance.Customer;
import instance.ProductCart;
import products.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShopManager {
    private Map<String, Integer> mapOfOrder = new HashMap<>();
    private String nameCustomer;
    private int ageCustomer;
    private int budgetCustomer;

    public String getNameCustomer() {
        return nameCustomer;
    }

    public int getAgeCustomer() {
        return ageCustomer;
    }

    public int getBudgetCustomer() {
        return budgetCustomer;
    }

    public void sayHello() throws IOException {
        ConsoleHelper.writeMessage("Добро пожаловать в наш магазин! Как вас зовут?");
        nameCustomer = ConsoleHelper.readText();
        ConsoleHelper.writeMessage("Сколько вам лет?");
        ageCustomer = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Введите ваш бюджет");
        budgetCustomer = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Отлично! Ваш профиль создан. Выберите позиции для покупки");
        for(Map.Entry<String, SomeProduct> entry : Storage.storageMap.entrySet()){
            System.out.print(entry.getKey() + ", ");
        }
        System.out.println();
        System.out.println("====================");
    }

    public Map<String, Integer> getOrder() throws IOException {
        while(true){
            ConsoleHelper.writeMessage("Введите название позиции или exit для выхода");
            String order = ConsoleHelper.readText().toLowerCase();
            if(order.equals("exit")){
                ConsoleHelper.writeMessage("Заказ передан на сборку");
                break;
            }
            ConsoleHelper.writeMessage("Введите количество");
            int count = ConsoleHelper.readInt();
            mapOfOrder.put(order, count);
        }
        return mapOfOrder;
    }

    public SomeProduct getTypeProduct(String nameProduct){
        return Storage.storageMap.get(nameProduct);
    }
}
