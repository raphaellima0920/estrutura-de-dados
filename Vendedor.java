
public class Vendedor {
    String nome;
    int cpf;
    String email;

    public Vendedor(String nome, int cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + '}';
    }
    
    
    
}
