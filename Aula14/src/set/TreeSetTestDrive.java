package set;

import models.Item;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new TreeSet<>();

        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Banana", 2));
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Pera", 4));

        itemSet.forEach(item -> System.out.println(item));
    }
}
