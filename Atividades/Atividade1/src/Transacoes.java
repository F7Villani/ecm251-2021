import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String receberPagamento(Usuario usuario, Conta conta, double valor){
        double valorReceber = valor;
        int codigo = getRandomNumberInRange(1000, 9999);
        
        return conta.getIdConta()+";"+usuario.getNome()+";"+valorReceber+";"+codigo;
    }
}
