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


    @Override
    public String toString() {
        return "Nome do Usuario" + usuario.getNome() + "Saldo: " + this.saldo;
    }
}
