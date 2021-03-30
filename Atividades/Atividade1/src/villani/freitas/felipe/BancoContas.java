package villani.freitas.felipe;

public class BancoContas {
    // Atributos
    private int max;
    private int tamanho;
    private Conta[] bancoContas;


    public BancoContas(int max) {
        this.max = max;
        this.bancoContas = new Conta[max];
        this.tamanho = 0;
    }

    // Metodos
     public boolean addConta(Conta conta){
        this.bancoContas[this.tamanho] = conta;
        this.tamanho++;
        return true;
     }

    @Override
    public String toString() {
        return bancoContas[0].toString();
    }
}
