/*

    Felipe Villani
    RA: 19.01370-0

 */

package villani.freitas.felipe;

public class BancoContas {
    // Atributos
    private int max;
    private Conta[] bancoContas;



    public BancoContas(int max) {
        this.max = max;
        this.bancoContas = new Conta[max];
    }


    // Metodos
     public boolean addConta(Conta conta){
        // Adiciona uma conta ao bancoContas
        // Index da conta adicionada é gerada pelo gerarID
        // Index = IdConta - 1
        this.bancoContas[conta.getIdConta()-1] = conta;
        return true;
     }

     public boolean validarConta(String qrcode){
        // A partir do QRCode esse metodo valida se a conta está cadastrada no bancoContas

         String[] dados = qrcode.split(";");
        int idConta = Integer.parseInt(dados[0]);

        // IdConta = index no bancoConta + 1
        if (bancoContas[idConta-1].getUsuario().getNome().equals(dados[1])){
            return true;
        }
        else{
            return false;
        }
     }

     public int gerarID(){
        // Gera o ID da proxima conta a ser registrada no bancoContas/
        // O IdConta a ser retornado = indexElementoNull + 1
        for(int i = 0; i<max; i++){
            if(this.bancoContas[i] == null){
                return i+1;
            }
        }
        return 0;
     }
/*
    @Override
    public String toString() {
        return bancoContas[0].toString();
    }*/
}
