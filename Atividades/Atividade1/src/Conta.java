public class Conta {
    //Atributos
    private int idConta;
    private double saldo;

    //Contrutor
    public Conta(int idConta, double saldoInicial){
        this.idConta = idConta;
        this.saldo = saldoInicial;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "idConta: " + this.idConta + ", Saldo: " + this.saldo;
    }

    public int getIdConta(){
        return this.idConta;
    }

    
}
