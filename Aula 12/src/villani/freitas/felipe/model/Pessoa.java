package villani.freitas.felipe.model;

/**
 * Classe que representa uma pessoa
 */
public class Pessoa {
    final private String nome;
    final private String cpf;

    /**
     * Construtor da classe pessoa
     * @param nome
     * @param cpf
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Devolve o estado do objeto pessa
     * @return
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
