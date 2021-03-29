import javax.swing.plaf.SliderUI;

public class Conta {
    // Atributos
    private int idConta;
    private double saldo;
    private Usuario usuario;

    // Construtor
    public Conta(double saldoInicial, Usuario usuarioConta){
        this.saldo = saldoInicial;
        this.usuario = usuarioConta;
    }

    // Metodos
    public String ToString(){
        return "IdConta: " + this.idConta + ", Saldo: R$ " + this.saldo;
    }
}
