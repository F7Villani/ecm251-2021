package villani.freitas.felipe.model;

public class Item {
    final public String nome;
    final public double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    /**
     * Método que cria um objeto Item dada uma string de entrada
     * @param dados String com valores do nome e do preço
     * @return Uma instância de item
     */
    public static Item pegaItem(String dados){
        return new Item(dados.split(",")[0],
                Double.parseDouble(dados.split(",")[1]));

    }
}
