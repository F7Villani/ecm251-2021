package villani.freitas.felipe.model;

/**
 * Classe que representa a instância de uma Conta.
 */

public class Conta {
    public double saldo;

    /**
     * Construtor da classe que incializa o saldo
     * @param saldo Vslor do saldo inicial
     */
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Contrutor padrão - sem saldo
     */
    public Conta() {
    }

    /**
     * Método que imprime o estado da Conta
     * @return
     */
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
