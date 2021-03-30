package villani.freitas.felipe;

import java.util.Random;

public class Transacao {

    // Método que gera um número aleatório entre um intervalo
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // Método que gera o QRCode em formato de String
    public String gerarQRCode(Conta conta, double valor){
        return conta.getIdConta() + ";" + conta.getUsuario().getNome() + ";" + valor + ";" +  getRandomNumberInRange(1000,9999);
    }

    // Método que realiza um pagamento
    public boolean realizarPagamento(Conta paga, Conta recebe, String qrcode){

        String[] dados = qrcode.split(";");
        double valor = Double.parseDouble(dados[2]);

        if(paga.getSaldo() >=valor ){
            paga.sacar(valor);
            recebe.depositar(valor);
        }
        else{
            return false;
        }
        return true;
    }

    private void getDepositar(Conta recebe, double valor) {
        recebe.depositar(valor);
    }
}
