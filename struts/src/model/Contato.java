
package treinandostruts; 

public class Contato {

    private Long id;
    private String nome, email, endereco;
    public Contato() {
    }
    public Contato(long id, String nome, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}