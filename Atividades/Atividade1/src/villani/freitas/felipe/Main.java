package villani.freitas.felipe;

public class Main {

    public static void main(String[] args) {

        Transacao transacao = new Transacao();
        BancoContas bancoContas = new BancoContas(20);

        Usuario u1 = new Usuario("All Might");
        Conta c1 = new Conta(1,1000.0,u1);

        bancoContas.addConta(c1);
        String string1 = transacao.gerarQRCode(c1,2);
        System.out.println(transacao.gerarQRCode(c1,2));
        System.out.println(bancoContas.validarConta(string1));
        /*
        Usuario u1 = new Usuario("All Might");
        Usuario u2 = new Usuario("One For All");
        Usuario u3 = new Usuario("Bakugo");

        Conta c1 = new Conta(1,1000.0,u1);
        Conta c2 = new Conta(2,250.0,u1);
        Conta c3 = new Conta(3,3000.0,u1);

        bancoContas.addConta(c1);
        bancoContas.addConta(c2);
        bancoContas.addConta(c3);

        System.out.println("Estado inicial: ");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        String pagamento1 = transacao.gerarQRCode(c1, 250.0);

        transacao.realizarPagamento(c2,c1,pagamento1);
        transacao.realizarPagamento(c3,c1,pagamento1);
        transacao.realizarPagamento(c2,c1,pagamento1);

        String pagamento2 = transacao.gerarQRCode(c2, 1000.0);

        transacao.realizarPagamento(c3,c2,pagamento2);

        System.out.println("Estado final: ");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

         */


    }
}
