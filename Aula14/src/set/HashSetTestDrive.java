package set;

import models.Item;
import java.util.HashSet;
import java.util.Set;

public class HashSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new HashSet<>();

        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Banana", 2));
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Pera", 4));

        itemSet.forEach(item -> System.out.println(item));

    }
}
