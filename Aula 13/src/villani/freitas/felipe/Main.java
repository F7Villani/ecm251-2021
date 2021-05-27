package villani.freitas.felipe;

import villani.freitas.felipe.model.Item;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        File file = new File("dados.txt");
        // Realiza a leitura do conteudo desse arquivo
        try{
            // Cria elemento para iterar pelo arquivo
            Scanner scanner = new Scanner(file);
            // Passa por todos os elementos do arquivo
            while(scanner.hasNext()){
                String linha = scanner.nextLine();
                Item item = Item.pegaItem(linha);
                itens.add(item);
                System.out.println("Linha Atual: " + linha);
            }
            exibeResumo(itens);
            criarNota(itens);
        }
        catch (Exception exception){
            System.out.println("Algo deu errado: ");
        }
    }

    private static void criarNota(List<Item> itens) throws Exception {
        FileWriter fileWriter = new FileWriter("nota.fsete");
        fileWriter.write("=== Resumo do Pedido ===\n");
        fileWriter.append("Total de Itens: \n" + itens.size());
        double total = 0;
        fileWriter.append("Itens: \n");
        for(Item item: itens){
            fileWriter.append(item.nome + "\t" + item.preco + "\n");
            total += + item.preco;
        }
        fileWriter.append("total do pedido: \n" + total);
        fileWriter.close();
    }

    private static void exibeResumo(List<Item> itens) {
        System.out.println("==== Resumo Pedido ====");
        System.out.println("Total de Itens: " + itens.size());
        double total = 0;
        System.out.println("Itens: ");
        for(Item item: itens){
            System.out.println(item.nome + "\t" + item.preco);
            total += + item.preco;
        }
        System.out.println("total do pedido: " + total);
    }


}
