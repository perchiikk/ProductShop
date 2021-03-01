package instance;

import products.*;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    public static Map<String, SomeProduct> storageMap = new HashMap<>();

    static {
        storageMap.put("пиво", new Beer());
        storageMap.put("сыр", new Cheese());
        storageMap.put("огурец", new Cucumbers());
        storageMap.put("сок", new Juice());
        storageMap.put("оливки", new Olives());
        storageMap.put("лук", new Onion());
        storageMap.put("картошка", new Potatos());
        storageMap.put("томат", new Tomatos());
        storageMap.put("вино", new Vine());
        storageMap.put("водка", new Vodka());
    }


}
