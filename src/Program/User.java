package Program;

public class User {

    private static int counter = 1;

    private String Nome;
    private String CPF;
    private String email;


    public User(String nome, String CPF, String email) {
        this.Nome = nome;
        this.CPF = CPF;
        this.email = email;
        counter =+ 1; //contagem recebe mais 1 toda vez que um usuário for criado
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return  "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nemail: " + this.getEmail();

    }
}