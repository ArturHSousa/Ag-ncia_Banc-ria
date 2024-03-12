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

    public String toString() {
        return  "\nNúmero da Conta: " + this.numeroConta +
                "\nNome: " + this.user.getNome() +
                "\nCPF: " + this.user.getCPF() +
                "\nEmail: " + this.user.getEmail() +
                "\nSaldo: " + Utils.doubleString(this.getSaldo()) +
                "\n";

    }

    public void depositar(Double deposito) {
        if (deposito > 0) {
            setSaldo(getSaldo() + deposito);
            System.out.println("Seu depósito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o seu depósito!");
        }
    }

    public void sacar(Double saque) {
        if (saque > 0 && this.getSaldo() >= saque){
            setSaldo(getSaldo() - saque);
            System.out.println("Seu saque foi realizado com sucesso!");
        }
        else{
            System.out.println("Não foi possivel realizar o seu saque!");
        }
    }

    public void trasferir(Conta ContaDepositada, Double trasferencia){
        if(trasferencia > 0 && this.getSaldo() >= trasferencia){
            setSaldo(getSaldo() - trasferencia);

            ContaDepositada.saldo = ContaDepositada.getSaldo() + trasferencia;
            System.out.println("Sua trasferencia foi realizado com sucesso!");
        }
        else{
            System.out.println("Não foi possivel realizar o sua trasferencia");
        }
    }
}