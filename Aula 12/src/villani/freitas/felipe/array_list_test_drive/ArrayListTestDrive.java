package villani.freitas.felipe.array_list_test_drive;

import villani.freitas.felipe.model.Conta;
import villani.freitas.felipe.model.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        //Adiciona um elemento dentro da lista
        pessoas.add(new Pessoa("All Might","1234567"));
        pessoas.add(new Pessoa("Endevour","4785622"));
        pessoas.add(new Pessoa("Hawk","45678913"));

        System.out.println("\nPassa por todos os elementos do ArrayList: ");
        pessoas.forEach((pessoa -> System.out.println(pessoa)));

        //Adiciona um novo elemento no ArrayList
        pessoas.add(1,new Pessoa("Midoria","456879"));

        System.out.println("\nPassa por todos os elementos do ArrayList: ");
        pessoas.forEach((pessoa -> System.out.println(pessoa)));

        List<Conta> contas = new ArrayList<>();
        contas.addAll(Arrays.asList(
                new Conta(1000), null, new Conta(504), new Conta())
        );

        System.out.println("\nPassa por todos os elementos do ArrayList: ");
        contas.forEach((conta -> System.out.println(conta)));
    }
}
