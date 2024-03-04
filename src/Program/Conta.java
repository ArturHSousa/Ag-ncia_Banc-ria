package Program;

import Util.Utils;

public class Conta {

    private static int counterConta = 1;

    private int numeroConta;
    private User user;
    private Double saldo = 0.00;

    public Conta(User user) {
        this.numeroConta = counterConta;
        this.user = user;
        counterConta += 1; //contagem recebe mais 1 toda vez que uma conta for criada
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return  "\nNúmero da Conta: " + this.numeroConta +
                "\nNome: "  + this.user.getNome() +
                "\nCPF: "   + this.user.getCPF()+
                "\nEmail: " + this.user.getEmail() +
                "\nSaldo: " + Utils.doubleString(this.getSaldo()) +
                "\n";

    }
}
