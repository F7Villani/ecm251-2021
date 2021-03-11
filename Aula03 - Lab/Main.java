

public class Main {
    public static void main(String[] args) {
        //Cria um objeto do tipo conta
        Conta c1;

        //Instancia um objeto do tipo conta
        c1 = new Conta();

        //Pede par exibir o saldo
        c1.visualizarSaldo();
        c1.saldo = 100.0;

        Conta c2 = new Conta();
        c2.saldo = 123.0;

        c1.sacar(100);
/*
        if (c1.sacar(4000))
        {
            System.out.println("Hoje tem Playstation");
        }
        else
        {
            System.out.println("Hoje não tem Playstation");
        }
*/
        
        c1.depositar(300);
        c2.depositar(100);
        
        if(c1.transferirDinheiro(c2,250)){
            System.out.println("Transferencia realizada com sucesso");
        }
        else{
            System.out.println("Não foi possível realizar a tranferência");
        }
        
        c1.visualizarSaldo();
        c2.visualizarSaldo();
        
    }
}