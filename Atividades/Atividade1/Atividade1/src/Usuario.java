public class Usuario {
    // Atributos
    private String nome;
    private String senha;
    private String email;

    // Construtor
    public Usuario (String nomeUsuario, String senhaUsuario, String emailUsuario){
        this.nome = nomeUsuario;
        this.senha = senhaUsuario;
        this.email = emailUsuario;
    }

    // Metodos
    public String ToString(){
        return "Nome: " + this.nome + ", Senha: " + this.senha + ", E-mail: " + this.email;
    }
}
