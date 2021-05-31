package maps;

import models.Item;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestDrive {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new HashMap<>();

        //Add Item no map
        itemMap.put("Item1", new Item("Maca",1));
        itemMap.put("Item2", new Item("Pera",2));
        itemMap.put("Item3", new Item("Maca",13));
        itemMap.put("Item1", new Item("Banana",1));

        // Passa por todos os elementos
        itemMap.forEach((chave, valor) -> System.out.println("Chave: "+chave+"\tValor: "+valor));

        // Recupera os items
        System.out.println(itemMap);

        // Outra forma de recuperar os itens do Map
        Item item = itemMap.get("Item1");
        System.out.println(item);
        item = itemMap.get("NaoExiste");
        System.out.println(item);
        item = itemMap.getOrDefault("Vegeta", new Item("Vegeta", 100));
    }
}
