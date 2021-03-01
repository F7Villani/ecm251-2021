package villani.freitas.felipe;

import java.util.Scanner;

public class Basico04 {
    public static void main(String[] args) {
        //Interagir com o terminal - entrada de dados do usuário
        String nome, mes, cavaleiro;
        System.out.println("Informe seu nome: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        System.out.println("Informe o mês do seu aniversário: ");
        mes = scanner.nextLine();

        System.out.println("Nome: " + nome + "  Mes: " + mes);
        cavaleiro = acharCavaleiro(mes);

        System.out.println("Cavaleiro: " + cavaleiro);

    }

    private static String acharCavaleiro(String mes) {
        if(mes.equals("janeiro")) return "Shura";
        else if(mes.equals("fevereiro")) return "Kamus";
        else if(mes.equals("março")) return "Afrodite";
        else if(mes.equals("abril")) return "Mu";
        else if(mes.equals("maio")) return "Aldebaram";
        else if(mes.equals("junho")) return "Saga/Kanon";
        else if(mes.equals("junlho")) return "Máscara da Morte";
        else if(mes.equals("agosto")) return "Aioria";
        else if(mes.equals("setembro")) return "Shaka";
        else if(mes.equals("outubro")) return "Mestre Ancião";
        else if(mes.equals("novembro")) return "Miro";
        else if(mes.equals("dezembro")) return "Aioros";

        return null;
    }
}
