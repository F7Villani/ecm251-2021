import java.util.Scanner;

public class Sistema {

    //Variáveis
    private boolean executarSistema;
    private Scanner scanner;

    //Construtor
    public Sistema(){
        this.scanner = new Scanner(System.in);
        this.executarSistema = true;
    }


    //Métodos
    public void executar(){
        int opcao;
        while(executarSistema){
          exibirMenu();  
          opcao = scanner.nextInt();
          avaliarOpcao(opcao);
        }
        
    }

    private void avaliarOpcao(int opcao){
        switch (opcao){
            case 0:
                System.out.println("Obrigado por escolher o MauaBank! ");
                this.executarSistema = false;
                break;
            default:
                System.out.println("Essa funcionalidade ainda não foi implementada");
        }
    }
    
    private void exibirMenu(){
        System.out.println(" ==== MauaBank ====");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Sacar Dinheiro");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Conta (Título)");
        System.out.println("0 - Encerrar");

    }
}
