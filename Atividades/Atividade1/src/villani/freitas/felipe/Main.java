package villani.freitas.felipe;

public class Main {

    public static void main(String[] args) {

        // Instanciando um objeto transacao e um bancoContas
        Transacao transacao = new Transacao();
        BancoContas bancoContas = new BancoContas(20);

        // Cria os usuários
        Usuario u1 = new Usuario("All Might");
        Usuario u2 = new Usuario("One For All");
        Usuario u3 = new Usuario("Bakugo");

        // Cria as contas e armazena no bancoContas
        Conta c1 = new Conta(bancoContas.gerarID(), 1000.0,u1);
        bancoContas.addConta(c1);
        Conta c2 = new Conta(bancoContas.gerarID(),250.0,u2);
        bancoContas.addConta(c2);
        Conta c3 = new Conta(bancoContas.gerarID(), 3000.0,u3);
        bancoContas.addConta(c3);

        // Printa o estado inicial das contas
        System.out.println("Estado inicial: ");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        // Gera o primeiro QRCode de pagamento
        String pagamento1 = transacao.gerarQRCode(c1, 250.0);

        // Realiza as transações teste
        transacao.realizarPagamento(c2,c1,pagamento1,bancoContas);
        transacao.realizarPagamento(c3,c1,pagamento1,bancoContas);
        transacao.realizarPagamento(c2,c1,pagamento1,bancoContas);

        // Gera o segundo QRCode de pagamento
        String pagamento2 = transacao.gerarQRCode(c2, 1000.0);

        // Realiza transação teste
        transacao.realizarPagamento(c3,c2,pagamento2,bancoContas);

        // Printa o estado final das contas
        System.out.println("Estado final: ");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());




    }
}
