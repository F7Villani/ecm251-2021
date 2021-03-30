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

    // Getters


    public int getTamanho() {
        return tamanho;
    }

    // Metodos
     public boolean addConta(Conta conta){
        this.bancoContas[this.tamanho] = conta;
        this.tamanho++;
        return true;
     }

     public boolean validarConta(String qrcode){

        String[] dados = qrcode.split(";");
        int idConta = Integer.parseInt(dados[0]);
        if (this.bancoContas[idConta-1].getUsuario().getNome().equals(dados[1])){
            return true;
        }
        else{
            return false;
        }
     }

    @Override
    public String toString() {
        return bancoContas[0].toString();
    }
}
