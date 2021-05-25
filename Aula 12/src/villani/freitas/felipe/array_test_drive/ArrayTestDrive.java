package villani.freitas.felipe.array_test_drive;

import villani.freitas.felipe.model.Conta;

public class ArrayTestDrive {
    public static void main(String[] args) {
        //Cria e incializa um vetor de inteiros
        int [] inteiros = {10,5,8,9,5};
        System.out.println("Passa por todas as posições: ");
        for (int i = 0; i<inteiros.length; i++){
            System.out.println(inteiros[i]);
        }

        // Cria e inicializa um vetor de Conta
        Conta [] contas = {new Conta(1000),null,new Conta(504), new Conta(), new Conta(1000)};
        System.out.println("Passa por todas as contas: ");
        for (Conta conta : contas){
            System.out.println(conta);
        }

    }
}
