public class Cliente {
    
    String cpf;
    String nome;
    String sobrenome;
    
    public Cliente(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

}
