/*

    Felipe Villani
    RA: 19.01370-0

 */

package villani.freitas.felipe;

public class Conta {
    //Atributos
    private int idConta;
    private double saldo;
    private Usuario usuario;


    //Construtor

    public Conta(int idConta, double saldo, Usuario usuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = usuario;
    }


    //Getters

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    // Metodos


    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    @Override
    public String toString() {
        return "Nome do Usuario" + usuario.getNome() + "Saldo: " + this.saldo;
    }
}
