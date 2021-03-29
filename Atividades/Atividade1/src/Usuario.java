public class Usuario {
    //Atributos
    private String nome;
    private String senha;
    private String email;
    private int idConta;

    //Contrutor
    public Usuario(int idConta, String nome){
        this.idConta = idConta;
        this.nome = nome;
    }

    //Metodos
    public String getNome(){
        return this.nome;
    }

    
}
