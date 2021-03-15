public class Cliente {
    
    private String cpf;
    private String nome;
    private String sobrenome;
    
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
