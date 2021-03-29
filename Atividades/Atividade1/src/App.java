public class App {

    
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(0,1000.00);
        Usuario u1 = new Usuario(0, "Felipe");
        Transacoes transacao = new Transacoes();
        
        System.out.println(transacao.receberPagamento(u1, c1, 500.00));
    }


}

