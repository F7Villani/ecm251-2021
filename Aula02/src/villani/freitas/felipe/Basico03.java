package villani.freitas.felipe;

import java.util.Random;

public class Basico03 {
    public static void main(String[] args) {
        //Estruturas de repetição
        int limite = 10;
        int contador;

        for(contador = 0; contador<limite; contador++)
        {
            System.out.println("contador atual: "+ contador);
        }

        Random sorteador = new Random();
        int numero = sorteador.nextInt(1000);
        System.out.println("Número sorteado: "+ numero);

        int senha = 123456;
        int tentativa = 0, chute;
        chute = sorteador.nextInt(999999);
        while(chute != senha)
        {
            tentativa++;
            System.out.println("Ainda não quebramos: "+ chute);
            System.out.println("Tentativa: "+tentativa);
            chute = sorteador.nextInt(999999);

        }
        System.out.println("Parabens! Quase um cracker!");
        System.out.println("Levou apenas: "+tentativa);
        System.out.println("A senha é: "+chute);
    }
}
