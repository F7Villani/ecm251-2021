package villani.freitas.felipe.linked_list_test_drive;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("Pallet");
        cidades.add("Veridian");
        cidades.add("Pewter");
        cidades.add("Cerulean");
        cidades.add("Veridian");
        cidades.add("Celadon");
        cidades.add("Saffron");
        cidades.add("Ilhas Cinabar");

        System.out.println("\nPassa pelas cidades: ");
        cidades.forEach((cidade) -> System.out.println(cidade));

        cidades.add(5,"Safari Zone");

        System.out.println("\nPassa pelas cidades: ");
        cidades.forEach((cidade) -> System.out.println(cidade));

        //Trabalhando com um Iterator
        Iterator<String> iterator = cidades.iterator();
        //Navega pelos elementos do LinkedList usando iterator
        System.out.println("\nPassa pelas cidades: ");
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
