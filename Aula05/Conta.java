

public class Conta {
    //Atributos
    private Cliente cliente;
    private double saldo;
    private int numero;

    //Construtor
    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;

    }

    //Métodos
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean sacar(double valor){
        if(valor <= this.saldo)
        {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferirDinheiro(Conta destino, double valor){
        if(this.sacar(valor))
        {
            destino.depositar(valor);
            return true;
        }
        return false;
    }   

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }

}
